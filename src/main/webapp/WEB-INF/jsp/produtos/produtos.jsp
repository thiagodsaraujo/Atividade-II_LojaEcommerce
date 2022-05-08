<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags/" prefix="tag"%>
<%@page language="java"%>

<!DOCTYPE html>
<html lang="pt-br">

<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
  <meta name="description" content="" />
  <meta name="author" content="" />
  <title>E-Commerce - Produtos</title>
  <link rel="icon" type="image/x-icon" href="assets/img/favicon.ico" />
  <!-- Font Awesome icons (free version)-->
  <script src="https://use.fontawesome.com/releases/v5.15.1/js/all.js" crossorigin="anonymous"></script>
  <!-- Google fonts-->
  <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css" />
  <link href="https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic" rel="stylesheet"
    type="text/css" />
  <link href="https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700" rel="stylesheet" type="text/css" />
  <!-- Core theme CSS (includes Bootstrap)-->
  <link href="css/styles.css" rel="stylesheet" />
</head>

<body id="page-top">
  <!-- Navigation-->
  <tag:menu-superior></tag:menu-superior>
  <!-- Masthead-->
  <header class="masthead" id="login">
    <div class="container"></div>
  </header>
  <!-- produtos-->
  <section class="page-section bg-light" id="portfolio">
    <div class="container">
      <div>
        <form>
          <div class="row mb-5">
            <div class="col-md-6">
              <div class="form-group">
                <input class="form-control" id="email" type="email" placeholder="Pesquisar.." required="required"
                  data-validation-required-message="Please enter your email address." />
                <p class="help-block text-danger"></p>
              </div>
            </div>
            <div class="col-md-3">
              <div class="form-group">
                <select class="form-control" id="email" required="required"
                  data-validation-required-message="Please enter your email address.">
                  <option>Roupas</option>
                  <option>AcessÃ³rios</option>
                </select>
                <p class="help-block text-danger"></p>
              </div>
            </div>
            <div class="col-md-3">
              <div class="form-group mb-md-0">
                <button class="btn btn-primary btn-xl text-uppercase js-scroll-trigger">Pesquisar</button>
              </div>
            </div>
          </div>
          <div class="row mb-2 ml-1">
            <button title="Editar" onclick="window.location.href='formproduto.html#formproduto'" class="btn btn-success mb-3"  type="button">
                <i class="fas fa-plus mr 1"></i>
                Novo Produto
            </button>
          </div>
        </form>
      </div>
      <div class="row">
        <div class="col-lg-4 col-sm-6 mb-4">
          <div class="portfolio-item">
            <a class="portfolio-link" data-toggle="modal" href="#portfolioModal1">
              <div class="portfolio-hover">
                <div class="portfolio-hover-content">
                  <i class="fas fa-plus fa-3x"></i>
                </div>
              </div>
              <img class="img-fluid" src="assets/img/portfolio/01-thumbnail.jpg" alt="" />
            </a>
            <div class="portfolio-caption">
              <div class="portfolio-caption-heading">R$ 99,00</div>
              <div class="portfolio-caption-subheading text-muted">
                Camisa Polo Basica
              </div>
            </div>
          </div>
        </div>

        <!-- Modal 1-->
        <div class="portfolio-modal modal fade" id="portfolioModal1" tabindex="-1" role="dialog" aria-hidden="true">
          <div class="modal-dialog mx-auto">
            <div class="modal-content">
              <div class="close-modal" data-dismiss="modal">
                <img src="assets/img/close-icon.svg" alt="Close modal" />
              </div>
              <div class="container">
                <div class="row justify-content-center">
                  <div class="col-lg-8">
                    <div class="modal-body">
                      <!-- Project Details Go Here-->
                      <img class="img-fluid d-block mx-auto img-modal" src="assets/img/portfolio/01-full.jpg" alt="" />
                      <h2 class="text-uppercase">R$ 99,00</h2>
                      <p class="item-intro text-muted">
                        Camisa Polo Basica
                      </p>
                      <p>
                        A camisa polo possui algumas qualidades e a maior delas sem dÃºvidas Ã© a sua versatilidade, pois vocÃª consegue usÃ¡-la nÃ£o sÃ³ em ambientes extremamente informais, como em ambientes atÃ© um pouco mais formais. EntÃ£o, esse tipo de camisa transita bem entre os dois, afinal ela estÃ¡ no meio do caminho entre o formal e o informal, entre uma camiseta e uma camisa social.
                      </p>
                      <ul class="list-inline">
                        <li>Valido AtÃ©: 01/03/2021</li>                     
                      </ul>
                      <div class="d-flex justify-content-center">
                        <div class="form-group mb-md-0 ml-2">
                          <button class="btn btn-primary btn-xl text-uppercase js-scroll-trigger">Comprar</button>
                        </div>
                        <div class="form-group mb-md-0 ml-2">
                          <button class="btn btn-info btn-xl text-uppercase js-scroll-trigger" onclick="window.location.href='formproduto.html#formproduto'" >Editar</button>
                        </div>
                      </div>
                      
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>

        <div class="col-lg-4 col-sm-6 mb-4">
          <div class="portfolio-item">
            <a class="portfolio-link" data-toggle="modal" href="#portfolioModal2">
              <div class="portfolio-hover">
                <div class="portfolio-hover-content">
                  <i class="fas fa-plus fa-3x"></i>
                </div>
              </div>
              <img class="img-fluid" src="assets/img/portfolio/02-thumbnail.jpg" alt="" />
            </a>
            <div class="portfolio-caption">
              <div class="portfolio-caption-heading">R$ 30,00</div>
              <div class="portfolio-caption-subheading text-muted">
                Bandeira Keep
              </div>
            </div>
          </div>
        </div>
        <div class="col-lg-4 col-sm-6 mb-4">
          <div class="portfolio-item">
            <a class="portfolio-link" data-toggle="modal" href="#portfolioModal3">
              <div class="portfolio-hover">
                <div class="portfolio-hover-content">
                  <i class="fas fa-plus fa-3x"></i>
                </div>
              </div>
              <img class="img-fluid" src="assets/img/portfolio/03-thumbnail.jpg" alt="" />
            </a>
            <div class="portfolio-caption">
              <div class="portfolio-caption-heading">R$ 95,00</div>
              <div class="portfolio-caption-subheading text-muted">
                Molde para Sapato
              </div>
            </div>
          </div>
        </div>
        <div class="col-lg-4 col-sm-6 mb-4 mb-lg-0">
          <div class="portfolio-item">
            <a class="portfolio-link" data-toggle="modal" href="#portfolioModal4">
              <div class="portfolio-hover">
                <div class="portfolio-hover-content">
                  <i class="fas fa-plus fa-3x"></i>
                </div>
              </div>
              <img class="img-fluid" src="assets/img/portfolio/04-thumbnail.jpg" alt="" />
            </a>
            <div class="portfolio-caption">
              <div class="portfolio-caption-heading">R$ 4.199,00</div>
              <div class="portfolio-caption-subheading text-muted">
                Camera Canon EOS
              </div>
            </div>
          </div>
        </div>
        <div class="col-lg-4 col-sm-6 mb-4 mb-sm-0">
          <div class="portfolio-item">
            <a class="portfolio-link" data-toggle="modal" href="#portfolioModal5">
              <div class="portfolio-hover">
                <div class="portfolio-hover-content">
                  <i class="fas fa-plus fa-3x"></i>
                </div>
              </div>
              <img class="img-fluid" src="assets/img/portfolio/05-thumbnail.jpg" alt="" />
            </a>
            <div class="portfolio-caption">
              <div class="portfolio-caption-heading">R$ 2.349,00</div>
              <div class="portfolio-caption-subheading text-muted">
                Notebook Inspiron 15 3000 4GB 500GB
              </div>
            </div>
          </div>
        </div>
        <div class="col-lg-4 col-sm-6">
          <div class="portfolio-item">
            <a class="portfolio-link" data-toggle="modal" href="#portfolioModal6">
              <div class="portfolio-hover">
                <div class="portfolio-hover-content">
                  <i class="fas fa-plus fa-3x"></i>
                </div>
              </div>
              <img class="img-fluid" src="assets/img/portfolio/06-thumbnail.jpg" alt="" />
            </a>
            <div class="portfolio-caption">
              <div class="portfolio-caption-heading">R$ 2.549,00</div>
              <div class="portfolio-caption-subheading text-muted">
                iPhone SE Apple 64GB
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>

  <tag:footer></tag:footer>
  
  <!-- Bootstrap core JS-->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"></script>
  <!-- Third party plugin JS-->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
  <!-- Contact form JS-->
  <script src="assets/mail/jqBootstrapValidation.js"></script>
  <script src="assets/mail/contact_me.js"></script>
  <!-- Core theme JS-->
  <script src="js/scripts.js"></script>
  <script></script>
</body>

</html>