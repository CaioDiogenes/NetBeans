<html>
<head><title>dados retornados do formulário</title></head>
<body>
<?php

	require './class-phpmailer.php';

	$Nome = $_POST['Nome'];
	$Email = $_POST['Email'];
	$Assunto = $_POST['Assunto'];
	$Mensagem = $_POST['Mensagem'];

	$mensagem_erro="";
	$erro=0;

	if ($Nome == ""){
		$erro=$erro + 1;
		$mensagem_erro = $mensagem_erro. " - O campo [Nome] é de preenchimento obrigatório.<br>";
	}

	if ($Nome == ""){
		$erro=$erro + 1;
		$mensagem_erro = $mensagem_erro. " - O campo [Nome] é de preenchimento obrigatório.<br>";
	}
		
	if ($erro >= 1){
		print "<h3>Seu formulário contém $erro erro(s) descritos(s) a seguir;</h3>";
		print $mensagem_erro;
		print "<br><input type='BUTTON' VALUE='Corrigir erros' ONCLICK='javascript:history.go(-1)'>";
	}
	else{
		$mail = new PHPMailer();
		$mail->IsSMTP();
		$mail->Mailer = 'smtp';
		$mail->SMTPAuth = true;
		$mail->Host = 'smtp.gmail.com'; // "ssl://smtp.gmail.com" didn't worked
		$mail->Port = 465;
		$mail->SMTPSecure = 'ssl';
		// or try these settings (worked on XAMPP and WAMP):
		// $mail->Port = 587;
		// $mail->SMTPSecure = 'tls';
		 
		$mail->Username = "clinica.caoegato@gmail.com";
		$mail->Password = "clinica2017";
		 
		$mail->IsHTML(true); // if you are going to send HTML formatted emails
		$mail->SingleTo = true; // if you want to send a same email to multiple users. multiple emails will be sent one-by-one.
		 
		$mail->From = $Email;
		$mail->FromName = $Nome;
		 
		$mail->addAddress("clinica.caoegato@gmail","clinica.caoegato");
		 
		$mail->Subject = $Assunto;
		$mail->Body = $Mensagem;
		 
		if(!$mail->Send()){
		    echo "Mensagem não enviada... <br />PHPMailer Error: " . $mail->ErrorInfo;
		}
		else{
		    echo "Mensagem enviada com sucesso!";
		}
				
		print "<br><b>Nome:</b> $Nome <br>";
		print "<b>Email:</b> $Email <br>";
		print "<b>Assunto:</b> $Assunto <br>";
		print "<b>Mensagem:</b> $Mensagem <br>";
		print "<br><input type='BUTTON' VALUE='Voltar' ONCLICK='javascript:history.go(-1)'>";
	}

?>
</body>
</html>