var palabraOculta = "CALLE"
var numOportunidades = 5//Contrala el numero de intentos
var numLetrasEncontradas = 0//Contrala el numero de letras que se han encontrado

function probarLetra() {
	var letraCaja = document.getElementById('letraPrueba').value
	var letraEncontrada = false
	for (i = 0; i < palabraOculta.length; i++) {
		if (letraCaja == palabraOculta[i]) {
			document.getElementById('letra' + (i + 1)).value = letraCaja
			letraEncontrada = true
			numLetrasEncontradas = numLetrasEncontradas + 1
		}
	}

	if (numLetrasEncontradas == palabraOculta.length) {//SI HA GANADO
		document.getElementById('texto').innerHTML = "HAS GANADO!!! ENHORABUENA!!!! "
		document.getElementById('texto').style.color = "green"
		document.getElementById('texto').style.size = "20"
	} else {//Si NO HA GANADO
		if (letraEncontrada) {
			document.getElementById('texto').innerHTML = "BIEN"
			document.getElementById('texto').style.color = "green"
		} else {
			document.getElementById('texto').innerHTML = "SIGUE PROBANDO!!"
			document.getElementById('texto').style.color = "red"
			numOportunidades = numOportunidades - 1
			document.getElementById('oportunidades').innerHTML = numOportunidades
		}

		if (numOportunidades == 0) {
			document.getElementById('texto').innerHTML = "HAS PERDIDO"
			document.getElementById('texto').style.color = "red"
			document.getElementById('texto').style.size = 10

		}
	}

}
function convertirMayuscula() {
	var letraCaja = document.getElementById('letraPrueba').value
	document.getElementById('letraPrueba').value = letraCaja.toUpperCase()
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