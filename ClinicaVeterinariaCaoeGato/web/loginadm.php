<html>
<head>
</head><body>

<?php

	$usuario = $_POST['nome'];
	$senha = $_POST['senha'];
	$mensagem="";
	$erro=0;


	if($usuario == ""){
		$erro = $erro + 1;
		$mensagem = $mensagem . "<b>Usuário Obrigatório!<br></b>";
	}

	if($senha == ""){
		$erro = $erro + 1;
		$mensagem = $mensagem . "<b>Senha Obrigatório!</b><br>";
	}

	if ($usuario != "clinica.caoegato" || $senha != "clinica2017"){
		$erro = $erro + 1;
		$mensagem = $mensagem . "<b>Administrador invalido!</b><br>";
	}
	
	if($erro >=1){
		print "<h1>Login inválido </h1><br>";
		print $mensagem;
		print "<br><input type='BUTTON' value='Voltar' ONCLICK='javascript:history.go(-1)'>";
	}
	else{
		print "<h1>Seja bem vindo $usuario </h1>";
		header("Location: cadserv.html");
	}
?>

</body>
</html>