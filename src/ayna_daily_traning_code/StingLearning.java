package ayna_daily_traning_code;

public class StingLearning {
    public static void main(String[] args) {
        /*
HTTP is the protocol that governs communications between web servers and web clients (i.e. browsers). Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request. Some of the codes and their meanings are listed below:
status code:
        200, OK
        201, Created
        202, Accepted
        301, Moved Permanently
        303, See Other
        304, Not Modified
        307, Temporary Redirect
        400, Bad Request
        401, Unauthorized
        403, Forbidden
        404, Not Found
        410, Gone
        500, Internal Server Error
        503, Service Unavailable
1. declare an int variable called StatusCode
2. write a if statement that prints out, on a line by itself,
the appropriate label from the above list based on status.
 */

       int StatusCode  =  503;
        String  result = " ";

        if(StatusCode ==  200){
            result = "OK";
        } if(StatusCode == 201){
            result  = "Created";
        } if(StatusCode  ==  202){
            result  =" Accepted";
        }if (StatusCode == 302){
            result =  "Moved Permanently";
        }if(StatusCode ==  303){
            result = "See Others";
        } if(StatusCode == 304){
            result  = "Not Modified";
        } if(StatusCode  ==  307){
            result  =" Temporary Redirect";
        }if (StatusCode == 400){
            result =  "Bad Request";
        }if(StatusCode ==  401){
            result = "Unauthorized";
        } if(StatusCode == 403){
            result  = "Forbiden";
        } if(StatusCode  ==  404){
            result  =" Not Found";
        }if (StatusCode == 410){
            result =  "Gone";
        } if(StatusCode ==500){
            result = "Internal Server Error";
        } if(StatusCode==503){
            result ="Server Unable";
        }
        System.out.println(result);

    }
}
