<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Добавить поезд</title>
</head>
<body>
<h1>Добавить новый поезд</h1>

<form action="/kr_oris2_war_exploded/add" method="post">
    <div>
        <label>ID водителя:</label>
        <input type="number" name="id_driver" required>
    </div>
    <br>
    <div>
        <label>Название:</label>
        <input type="text" name="name" required>
    </div>
    <br>
    <div>
        <label>Номер поезда:</label>
        <input type="number" name="number_train" required>
    </div>
    <br>
    <div>
        <label>Номер дороги:</label>
        <input type="number" name="number_road" required>
    </div>
    <br>
    <button type="submit">Добавить поезд</button>
</form>

<br>
<a href="/kr_oris2_war_exploded/show">Вернуться к списку</a>
</body>
</html>