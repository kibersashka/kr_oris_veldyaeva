<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Поезда</title>
    <meta name="description" content="Поезда">

    <style>
        .tablo {
            display: flex;
            flex-direction: column;
        }
        .tablo-row {
            display: flex;
            flex-direction: row;
            font-weight: lighter;
        }
        .tablo-row div {
            width: 150px;
            padding: 10px;
            border: 1px solid #ccc;
        }
        .tablo-head {
            font-weight: bold;
        }
        .search-form {
            margin-bottom: 20px;
            padding: 15px;
            border: 1px solid #ccc;
            background-color: #f9f9f9;
        }
        .search-form input {
            padding: 8px;
            margin-right: 10px;
            width: 200px;
        }
        .search-form button {
            padding: 8px 15px;
            background-color: #007bff;
            color: white;
            border: none;
            cursor: pointer;
        }
        .search-form button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<h1>Поезда</h1>


<div class="search-form">
    <form action="/kr_oris2_war_exploded/showone" method="get">
        <label>Введите ID поезда:</label>
        <input type="number" name="id" placeholder="Введите ID" required>
        <button type="submit">Перейти к редактированию</button>
    </form>

    <a href="/kr_oris2_war_exploded/add">
        <button type="button" style="margin-left: 20px;">Добавить поезд</button>
    </a>
</div>

<div class="tablo">
    <div class="tablo-row tablo-head">
        <div> ID </div>
        <div> ID водителя </div>
        <div> Название </div>
        <div> Номер поезда </div>
        <div> Номер дороги </div>
    </div>

    <#list trains as train>
        <div class="tablo-row">
            <div> ${train.id} </div>
            <div> ${train.id_driver} </div>
            <div> ${train.name} </div>
            <div> ${train.number_train} </div>
            <div> ${train.number_road} </div>
        </div>
    </#list>

</div>
</body>
</html>