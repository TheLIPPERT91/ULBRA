<?php

    require_once('views/header.php');

    if(!isset($_GET['module'])){

        require_once('views/home.php');

    }else{
        switch (($_REQUEST['module'])) {

            case 'home':
                require_once('views/home.php');
            break;

            case 'products':
                require_once('views/products.php');
            break;

            case 'contact':
                require_once('views/contact.php');
            break;
        }
    }

    require_once('views/templates/footer.php');
?>