<%--
  Created by IntelliJ IDEA.
  User: Иван
  Date: 21.12.2018
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ru">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"
          integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">

    <title>Bootstrap 4: всплывающая форма обратной связи</title>
</head>
<body>

<div class="container">
    <div class="my-5 mx-auto text-center">
        <button class="btn btn-dark btn-lg" data-toggle="modal" data-target="#exampleModal">Открыть модальное окно</button>
    </div>
</div>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Обратная связь</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form id="contactForm" action="handler.php" method="post">
                    <div class="form-group">
                        <label for="name">Ваше имя:</label>
                        <input id="name" class="form-control" name="name" required type="text" placeholder="Иванов Иван Иванович">
                    </div>
                    <div class="form-group">
                        <label for="email">Ваш E-mail:</label>
                        <input id="email" class="form-control" name="email" required type="email" placeholder="ivanov@email.com">
                    </div>
                    <div class="form-group">
                        <label for="phone">Ваш телефон:</label>
                        <input id="phone" class="form-control" name="phone" required type="text" placeholder="+7 (800) 000-00-00">
                    </div>
                    <div class="form-group">
                        <label for="message">Текст сообщения:</label>
                        <textarea id="message" class="form-control" required name="message" rows="4"></textarea>
                    </div>
                    <div class="form-group form-check">
                        <input id="check" class="form-check-input" checked type="checkbox">
                        <label class="form-check-label" for="check">Я добровольно отправляю свои данные</label>
                    </div>
                    <button id="button" class="btn btn-success" type="submit">Отправить</button>
                    <div class="result">
                        <span id="answer"></span>
                        <span id="loader" style="display:none"><img src="images/loader.gif" alt=""></span>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->

<!-- Подключение урезанной версии jQuery -->
<!-- <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script> -->

<!-- Подключение полной версии jQuery -->
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"
        integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"
        integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>

<!-- Маска для номера телефона -->
<script src="js/jquery.maskedinput.min.js"></script>
<!-- Инициализация и Ajax-запрос -->
<script src="js/main.js"></script>
</body>
</html>
