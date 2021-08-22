<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Projeto PW</title>
        <!-- Links Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

    <link rel="stylesheet" href="/assets/css/style.css">
    <script src="/assets/js/script.js"></script>
</head>
<body>

    <header class="jumbotron text-center mb-0">
        <h1>Minha Página de Programação Web</h1>
        <p>Minha primeira página para a disciplina de PW</p>
        <p> <?php echo("<h4>PHP é top!<h4/>"); ?> </p>
    </header>
    
    <div class="container-fluid">
        <div class="row">
            <nav class="col-md-2">
                <h2>MENU:</h2>
                <a href="?m=h">Home</a><br>
                <a href="?m=p">Página</a><br>
                <a href="?m=s">Sobre</a><br>
                <a href="?m=c">Contato</a><br>
            </nav>

    <section class="col-10 p-4 ">