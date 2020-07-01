"use strict";
function Session(x){
	sessionStorage.setItem('ctx', x)
	sessionStorage.setItem('js', x+'/resources/js')
	sessionStorage.setItem('css', x+'/resources/css')
	sessionStorage.setItem('img', x+'/resources/img')
}