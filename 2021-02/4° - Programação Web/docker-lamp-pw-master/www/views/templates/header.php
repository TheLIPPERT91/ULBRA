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
            <nav class=" navbar-nav col-md-2">
                <ul class ="navbar-nav">
                    <h5>MENU:</h5>
                    <li class="nav-item">
                        <a id="home" class="nav-link" href="?controller=site&action=home">Home</a>
                    </li>
                    <li class="nav-item">
                        <a id="products" class="nav-link" href="?controller=site&action=products">Produtos</a>
                    </li>
                    <li class="nav-item">
                        <a id="about" class="nav-link" href="?controller=site&action=about">Sobre</a>
                    </li>
                    <li class="nav-item">
                        <a id="contact" class="nav-link" href="?controller=site&action=contact">Contato</a>
                    </li>
                    
                    <h5>CLIENTES:</h5>
                    <li class="nav-item">
                        <a id="" class="nav-link" href="?controller=client&action=register">Cadastro</a>
                    </li>
                </ul>
            </nav>


    <section class="col-10 p-4 ">