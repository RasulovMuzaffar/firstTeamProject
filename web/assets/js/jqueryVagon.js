 function validFormLogin (form)
    {
        console.log('1');
        var login = $('input[name=username]').val();
        var password = $('input[name=password').val();
        var indicatorArrorLogin = 0;
        var indicatorArrorPassword = 0;

        if (login=="")
            {
                console.log('2');
                $('#login-username-error').css('display','block');

            }
        else
            {
                $('#login-username-error').css('display','none');
                indicatorArrorLogin=1;
              
            }

        if (password=="") 
            {
            
                console.log('3');
                $('#login-password-error').css('display','block');
            }
        else
            {
                $('#login-password-error').css('display','none');
                indicatorArrorPassword=1;
    
            }
                console.log(indicatorArrorLogin);
                console.log(indicatorArrorPassword);
                if (indicatorArrorLogin==1 && indicatorArrorPassword==1 ) 
                    {
                        form.submit();
                    };
    }

    function validFormCheckIn (form)
    {
       console.log('1');
       var lastname = $('input[name=register-lastname]').val();
       var firstname = $('input[name=register-firstname]').val();
       var login = $('input[name=register-login]').val();
       var email = $('input[name=register-email]').val();
       var password = $('input[name=register-password]').val();
       var position = $('select[name=material-position]').val();
       var servic = $('select[name=material-service]').val();
       var indicatorArrorLastname = 0;
       var indicatorArrorFirstname = 0;
       var indicatorArrorLogin = 0;
       var indicatorArrorEmail = 0;
       var indicatorArrorPassword = 0;
       var indicatorArrorPosition = 0;
       var indicatorArrorServic = 0;
        if (lastname=="")
            {
                $('#checkIn-lastname-error').css('display','block');
            }
        else
            {
                $('#checkIn-lastname-error').css('display','none');
                indicatorArrorLastname=1;
            }

        if (firstname=="")
            {
                $('#checkIn-firstname-error').css('display','block');
            }
        else
            {
                $('#checkIn-firstname-error').css('display','none');
                indicatorArrorFirstname=1;
            }
        if (login=="")
            {
                $('#checkIn-login-error').css('display','block');
            }
        else
            {
                $('#checkIn-login-error').css('display','none');
                indicatorArrorLogin=1;
            }
        if (email=="")
            {
                $('#checkIn-mail-error').css('display','block');
            }
        else
            {
                $('#checkIn-mail-error').css('display','none');
                indicatorArrorEmail=1;
            }
        if (password=="")
            {
                $('#checkIn-password-error').css('display','block');
            }
        else
            {
                $('#checkIn-password-error').css('display','none');
                indicatorArrorPassword=1;
            }
            console.log(position);
        if (position==undefined)
            {
                $('#checkIn-position-error').css('display','block');
            }
        else
            {
                $('#checkIn-position-error').css('display','none');
                indicatorArrorPosition=1;
            }
            console.log(servic);
        if (servic==undefined)
            {
                $('#checkIn-service-error').css('display','block');
            }
        else
            {
                $('#checkIn-service-error').css('display','none');
                indicatorArrorServic=1;
            }
                console.log(indicatorArrorLogin);
                console.log(indicatorArrorPassword);
                if (indicatorArrorLastname==1  &&
                    indicatorArrorFirstname==1 &&
                    indicatorArrorLogin==1     &&
                    indicatorArrorEmail==1     &&
                    indicatorArrorPassword==1  &&
                    indicatorArrorPosition==1  &&
                    indicatorArrorServic==1    
                    ) 
                    {
                        form.submit();
                    };
   }