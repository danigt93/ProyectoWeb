const palabraOculta = "PERRO"

function convertirMayuscula() {
	
	var letra = document.getElementById("letraPrueba").value;
	console.log(letra);
	document.getElementById("letraPrueba").value = letra.toUpperCase()
	document.getElementById("botonProbar").focus()
}

function probarLetra(){

	//Cogemos la letra a buscar dentro de la palabra
	var letra = document.getElementById("letraPrueba").value;
	
	var letraEncontrada = false
	var palabraCompleta = true
	//Por cada letra de la palabra miro si coincide con la letra introducida
	for(i = 0;i<palabraOculta.length;i++){
		if(letra==palabraOculta[i]){
			document.getElementById("letra"+(i+1)).value = letra
			letraEncontrada = true
			console.log(palabraOculta[i] + " BIEN")
		}
		console.log("'"+document.getElementById("letra"+(i+1)).value+"'")
		if(document.getElementById("letra"+(i+1)).value==''){
			console.log("Pasa")
			palabraCompleta = false
		}
		 
	}
	
	if(letraEncontrada){
		console.log(palabraCompleta)
		if (palabraCompleta){
			document.getElementById('texto').innerHTML = "HAS GANADO!!!!"
			document.getElementById('texto').style.color = "green"
		}else{
			document.getElementById('texto').innerHTML = "BIEN"
			document.getElementById('texto').style.color = "green"	
		}
		
	}else{
		document.getElementById('texto').innerHTML = "MAL"
		document.getElementById('texto').style.color = "red"
		
		numIntentos = document.getElementById('oportunidades').textContent
		
		if(numIntentos>1){
			document.getElementById('oportunidades').innerHTML = numIntentos-1
		}else{
			document.getElementById('texto').innerHTML = "Has perdido la respuesta era "+ palabraOculta  
			document.getElementById('texto').style.color = "red"
			document.getElementById('oportunidades').innerHTML = numIntentos-1
			document.getElementById("botonProbar").disabled="disabled"
		}
		
	}
	
	document.getElementById("letraPrueba").value = "";
	document.getElementById("letraPrueba").focus();
	
}


function reiniciar() {
	document.getElementById('letraPrueba').value = ""
	document.getElementById('letra1').value = ""
	document.getElementById('letra2').value = ""
	document.getElementById('letra3').value = ""
	document.getElementById('letra4').value = ""
	document.getElementById('letra5').value = ""

	numOportunidades = 5
	document.getElementById('texto').innerHTML = "BIENVENIDO"
	document.getElementById('texto').style.color = "black"
	document.getElementById('oportunidades').innerHTML = numOportunidades


}


