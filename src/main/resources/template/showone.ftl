<!DOCTYPE html>
<html>
<head>
    <title>Поезд</title>
    <meta charset="UTF-8">
</head>
<body>
<h1>Редактировать поезд</h1>

<#if train??>
    <form action="/kr_oris2_war_exploded/update" method="post">
        <input type="hidden" name="id" value="${train.id}">
        ID водителя: <input type="number" name="id_driver" value="${train.id_driver}"><br>
        Название: <input type="text" name="name" value="${train.name}"><br>
        Номер поезда: <input type="number" name="number_train" value="${train.number_train}"><br>
        Номер дороги: <input type="number" name="number_road" value="${train.number_road}"><br>
        <input type="submit" value="Сохранить">
    </form>
<#else>
    <p>Поезд не найден</p>
</#if>

<a href="/kr_oris2_war_exploded/show">Назад к списку</a>
</body>
</html>