<?php

    require_once('views/templates/header.php');

    if(!isset($_GET['m'])){

        require_once('views/pages/home.php');

    }else{
        switch (($_REQUEST['m'])) {

            case 'h':
                require_once('views/pages/home.php');
                break;

            case 'p':
                require_once('views/pages/products.php');
                break;

            case 's':
                require_once('views/pages/sobre.php');
                break;

            case 'c':
                require_once('views/pages/contact.php');
                break;
        }
    }

    require_once('views/templates/footer.php');
?>