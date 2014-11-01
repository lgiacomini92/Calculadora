/**
 * 
 */
function SomenteNumero(txtName, e){
	var displayAtual = document.getElementById(txtName).value;
    var tecla=(window.event)?event.keyCode:e.which;
    
    if(tecla > 47 && tecla < 58){
    	return true;
    }else if(tecla == 46){
    	if(displayAtual == ""){
    		document.getElementById(txtName).value = "0";
    		return true;
    	}else if (displayAtual.indexOf(".") == -1){
			return true;
		}else{
			return false;
		}
	}else{
    	if (tecla==8 || tecla==0){
    		return true;
    	}else {
    		return false;
    	}
    }
}

function calcula(){
	var txtNum1 = document.getElementById('txtNum1').value;
	var txtNum2 = document.getElementById('txtNum2').value;
	
	if (txtNum1.length == 0 || txtNum2.length == 0){
		alert("Favor preencher os dois números para o cálculo!");
	}else{
		document.frmCalculadora.submit();
	}
}

function calculaOperacao(op){
	document.getElementById("auxOperacao").value = op;
	calcula();
}