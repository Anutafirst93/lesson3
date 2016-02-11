<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
            table, tr, td{
                border: 1px solid black;
                border-collapse: collapse;
/*                width: 200px;*/
                height: 35px;
            }
            td{
                width: 200px;
            }
            .cy{
                background-color: cyan;
            }
            .mg{
                background-color: magenta;
            }
            
            #datatable{
                margin-left: auto;
                margin-right: auto;
            }
            
            .list li{
                font-size: 25pt;
                color: #ccfead;
            }
            .list{
                background-color: black;
                width: 300px;
                
            }
            .block{
                width: 300px;
                height: 300px;
                background-color: #ff9f15;
                position: absolute;
                margin: auto auto auto auto;
/*                to/p:0px;
                lef/t:0px;
                floa/t: left;*/
            }
            span{
                font-weight: bold;
                font-size: 16pt;
            }
        </style>
    </head>
    <body>
        <h1>Хай пиплы!</h1>
        <h2>Хай пиплы!</h2>
        <h10>Хай пиплы!</h10>
        <p>
            <span>Lorem ipsum dolor sit amet</span>, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 
        </p>
        <p>
            Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
        </p>
        <table id="datatable">
            <tr>
                <td class="cy">&nbsp;</td>
                <td class="mg">&nbsp;</td>
                <td class="cy">&nbsp;</td>
                <td class="mg">&nbsp;</td>
            </tr>
            <tr>
                <td class="mg">&nbsp;</td>
                <td class="cy">&nbsp;</td>
                <td class="mg">&nbsp;</td>
                <td class="cy">&nbsp;</td>
            </tr>
        </table>
        
        <ul class="list">
            <li>item</li>
            <li>item</li>
            <li>item</li>
            <li>item</li>
            <li>item</li>
        </ul>
        <ol>
            <li>item</li>
            <li>item</li>
            <li>item</li>
            <li>item</li>
            <li>item</li>
            <li>item</li>
        </ol>
        <div class="block">&nbsp;</div>
    </body>
</html>
