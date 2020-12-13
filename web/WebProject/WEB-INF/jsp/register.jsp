<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width,initial-scale=1.0"/>
    <title>HTML Document</title>
    <link rel ="stylesheet" href="../../css/bootstrap.css">
    <link rel ="stylesheet" href="../../css/font-awesome.min.css">
    <link rel ="stylesheet" href="../../css/main.css">

</head>
<body>
    <form action="action_page.php" method="post">

        <div class="container">
            <label for="uname"><b>Имя пользователя</b></label>
            <input type="text" placeholder="Enter Username" name="uname" required>
            </br>

            <label for="psw"><b>Пароль</b></label>
            <input type="password" placeholder="Enter Password" name="psw" required>
            </br>

            <label for="psw"><b>Повторите пароль</b></label>
            <input type="password_again" placeholder="Enter Password Again" name="psw_again" required>
            </br>

            <button type="submit">Авторизоваться</button>
            </br>
        </div>

    </form>
</body>

</html>
