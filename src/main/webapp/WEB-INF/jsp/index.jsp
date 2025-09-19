<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Telusko Calculator</title>
    <style>
        body {
            font-family: 'Roboto', sans-serif;
            background-color: #FAFAFA;
            color: #333;
            text-align: center;
            padding: 50px;
        }

        h2 {
            color: #795548;
            margin-bottom: 30px;
        }

        form {
            background-color: #FFFFFF;
            padding: 30px;
            border-radius: 4px;
            display: inline-block;
            box-shadow: 0 2px 4px rgba(0,0,0,0.2);
            max-width: 400px;
            width: 100%;
            box-sizing: border-box;
            margin-top: 20px;
        }

        input[type="text"], input[type="submit"] {
            border: 1px solid #E0E0E0;
            border-radius: 4px;
            padding: 10px 15px;
            margin: 10px 0;
            width: calc(100% - 30px);
            box-sizing: border-box;
            font-size: 16px;
        }

        input[type="text"] {
            background-color: #fff;
        }

        input[type="submit"] {
            background-color: #795548;
            color: white;
            border: none;
            font-weight: bold;
            cursor: pointer;
            outline: none;
            transition: background-color 0.3s, box-shadow 0.3s;
        }

        input[type="submit"]:hover {
            background-color: #5d4037;
        }

        input[type="submit"]:focus {
            box-shadow: 0 0 8px rgba(121, 85, 72, 0.6);
        }

        label {
            font-size: 18px;
            color: #795548;
            font-weight: normal;
            margin: 15px 0 5px;
            display: block;
            text-align: left;
        }

        p {
            color: #333;
            font-size: 24px;
            line-height: 1.6;
        }

        .result-container {
            background-color: #FFFFFF;
            padding: 30px;
            border-radius: 4px;
            display: inline-block;
            box-shadow: 0 2px 4px rgba(0,0,0,0.2);
            max-width: 400px;
            width: 100%;
            box-sizing: border-box;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <h2>Telusko Calculator</h2>

    <form action="add">
        <label for="num1">Enter 1st Number :</label>
        <input type="text" id="num1" name="num1"><br>

        <label for="num2">Enter 2nd Number :</label>
        <input type="text" id="num2" name="num2"><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
