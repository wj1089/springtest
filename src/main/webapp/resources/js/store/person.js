var person = person || {}
person = (function(){
	let _, javascript, session
	let init = function(){
		 _ = sessionStorage.getItem('ctx')
		 javascript = sessionStorage.getItem('js'),
		 session = sessionStorage.getItem('session')
	}
	let join = function(payload){
		$.ajax({
			url : _+`/user/users`,
			type: 'POST',
			data: JSON.stringify(payload),
			dataType: 'json',
			contentType: 'application/json; charset=UTF-8',
			success: function(res){
				if(res === 'SUCCESS'){
					location.href = _+`/location/user/loginform`
				}else{
					location.href = _+`/location/user/joinform`
				}
			},
			error: function(err){
				
			}
		})
	}
	let login = function(payload){
		$.ajax({
			url : _+`/users/${payload.userid}/login`,
			type: 'POST',
			data: JSON.stringify(payload),
			dataType: 'json',
			contentType: 'application/json; charset=UTF-8',
			success: function(res){
				alert(res)
			},
			error: function(err){
				alert(err)
			}
		})
	}
	let logout = function(){
		sessionStroage.removeItem('userid')
		sessionStroage.removeItem('ctx')
		sessionStroage.removeItem('js')
		sessionStroage.removeItem('css')
		sessionStroage.removeItem('img')
		location.href = _+`/`
	}
	let remove = function(){
		$.ajax()
		sessionStroage.removeItem('userid')
		sessionStroage.removeItem('ctx')
		sessionStroage.removeItem('js')
		sessionStroage.removeItem('css')
		sessionStroage.removeItem('img')
		location.href = _+`/`
	}
	return {init, join, login, logout, remove}
})()