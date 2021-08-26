<?php
    ini_set('display_erros', 1);
    ini_set('display_startup_errors', 1);
    error_reporting(E_ALL);

    if(!isset($_GET['controller'])){
        require_once('controllers/SiteController.php');
        $site = new SiteController();
        $site -> home();
    }else{
        switch ($_REQUEST['controller']) {
            case 'site':
                require_once('controllers/SiteController.php');
                $site = new SiteController();
                if(!isset($_GET['action'])){
                    $site -> home();
                }else{
                    switch (($_REQUEST['action'])) {
                        case 'home':
                            $site->home();
                        break;
                        case 'about':
                            $site->about();
                        break;
                        case 'products':
                            $site->products();
                        break;
                        case 'contact':
                            $site->contact();
                        break;
                        default;
                            $site-> home();
                    }
                }
            break;
            case 'client':
                require_once ('controllers/ClientController.php');
                $site = new ClientController();
                if(!isset($_GET['action'])){
                     
                }else{
                    switch (($_REQUEST['action'])) {
                        case 'register':
                            $site->register();
                        break; 
                    
                        case 'registerView':
                        $site->registerView();
                        break;
                    }
                }
            break;
        }
    }
?>