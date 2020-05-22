 
    //function that display value 
    function dis(val) 
    { 
        document.getElementById("result").value+=val 
    } 
    
    //function that evaluates the digit and return result 
    function solve() 
    { 
        let x = document.getElementById("result").value 
        let y = eval(x) 
        document.getElementById("result").value = y 
    } 
    
    //function that clear the display 
    function clr() 
    { 
        document.getElementById("result").value = "" 
    } 
    function myFunction() {
        var x = document.getElementById("frm1");
        var fname = "";
        var mail = "";
        mail = x.elements[0].value;
        fname = x.elements[1].value;
      var table = document.getElementById("table");
      var row = table.insertRow(0);
      var cell1 = row.insertCell(0);
      var cell2 = row.insertCell(1);
      cell1.innerHTML = mail;
      cell2.innerHTML =fname;
      
    }
    