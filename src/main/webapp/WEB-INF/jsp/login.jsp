<!DOCTYPE html>
<html>
<head>
    <title>Login Form</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background-color: #FFF5E1;
        }
        .form-container {
            text-align: center;
        }
        .form-container h4 {
            margin: 10px 0;
        }
        .form-container input[type="text"],
        .form-container input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            box-sizing: border-box;
        }
        .form-container button {
            background-color: green;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 12px;
            cursor: pointer;
            margin-top: 10px;
        }
        .form-container button:hover {
            background-color: darkgreen;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <form>
            <h4>User name</h4>
            <input type="text" name="userid" placeholder="USER ID"><br><br>
            <h4>Password</h4>
            <input type="password" name="password" placeholder="PASSWORD"><br><br>
            <button type="submit">Submit</button>
        </form>
    </div>
</body>
</html>
