/**
 * http://usejsdoc.org/
 */
var productList = [];
 $.ajax({url: "/getallproducts", success: function(result){
	 console.log("called ajax "+ result);
	 productList = result;
  }});
 
 $("#product_auto").change(function(){
 	
	 if(data != undefined && data != null  && data.text != null){
	    var data=$('#product_auto').select2('data')[0];
	    console.log(data.text);
	    console.log(productList);
	 }
	    });
 
 function initailizeSelect2(){
	 console.log('initailizeSelect2');
 $('.searchproduct').select2({
     theme: "bootstrap4",
     ajax: {
         url: '/getallproductsbyName',
         dataType: 'json',
         delay: 250,
         processResults: function (data) {
         	console.log(data);
         	
             return {
                 results: $.map(data, function (item) {
                     return {
                         text: item.productName,
                         id: item.id
                        
                     }
                 })
             };
            
         },
         cache: true
     }
 		,tags: true,
 		createSearchChoice: function(term, data) {
 		    if ($(data).filter(function() {
 		      return this.text.localeCompare(term) === 0;
 		    }).length === 0) {
 		      return {
 		        id: term,
 		        text: term
 		      };
 		    }
 		  },
 });
 }
 
 $("#add_new_row").click(function(){
 
	    let fieldNames = ['productName', 'mrp', 'productPrice', 'rate', 'quantity', 'sellingPrice'];
	    let listName = 'purchaseEntry';
	    let table = document.getElementById('myTable');
	    let rowIndex = table.getElementsByTagName('tr').length - 1;

	    let tr = document.createElement('tr');
	    fieldNames.forEach((fieldName) => {
	    	if(fieldName === 'productName'){
		        let td = document.createElement('td');
	    		console.log('Select ');
	    		 let input =  createSelect(listName, rowIndex, fieldName);
	    		 td.appendChild(input);
	    		
	 	        tr.appendChild(td);
	 	     
	    	}else{
	        let td = document.createElement('td');
	        let input = createInput(listName, rowIndex, fieldName);
	        td.appendChild(input);
	        tr.appendChild(td);
	        
	    }
	    });
	    table.appendChild(tr);
	    initailizeSelect2();
 });
 
 let createInput = function (listName, rowIndex, fieldName) {
	    let input = document.createElement('input');
	    input.id = listName + rowIndex + '.' + fieldName;
	    input.setAttribute('name', listName + '[' + rowIndex + '].' + fieldName);
	    return input;
	};

 let createSelect = function (listName, rowIndex, fieldName) {
	    let input = document.createElement('select');
	    input.id = listName + rowIndex + '.' + fieldName;
	    input.setAttribute('name', listName + '[' + rowIndex + '].' + fieldName);
	    input.setAttribute('class', 'form-control select2-single searchproduct');
	    input.setAttribute('style', 'width: 100%');
	    return input;
	    
	};
let rowIndex = document.getElementById('myTable').getElementsByTagName('tr').length - 1;
 