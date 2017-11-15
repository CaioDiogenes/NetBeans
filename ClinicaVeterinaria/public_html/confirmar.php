<html>
<head><title>dados retornados do formulário</title></head>
<body>
<?php

$Nome = $_POST['Nome'];
$Email = $_POST['Email'];
$Assunto = $_POST['Assunto'];
$Mensagem = $_POST['Mensagem'];

$mensagem_erro="";
$erro=0;

if ($Nome == ""){
	$erro=$erro + 1;
	$mensagem_erro = $mensagem_erro. " - O campo [Nome] é de preenchimento obrigatório.<br>";}

if ($nome == ""){
	$erro=$erro + 1;
	$mensagem_erro = $mensagem_erro. " - O campo [Nome] é de preenchimento obrigatório.<br>";}
	
if ($erro >= 1){
	print "<h3>Seu formulário contém $erro erro(s) descritos(s) a seguir;</h3>";
	print $mensagem_erro;
	print "<br><input type='BUTTON' VALUE='Corrigir erros' ONCLICK='javascript:history.go(-1)'>";}
		
print "<b>Nome:</b> $Nome <br>";
print "<b>Email:</b> $Email <br>";
print "<b>Assunto:</b> $Assunto <br>";
print "<b>Mensagem:</b> $Mensagem <br>";
print "Dados incluidos com sucesso!";}

?>
</body>
</html>