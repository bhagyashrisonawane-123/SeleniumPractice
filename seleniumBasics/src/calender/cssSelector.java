package calender;

/*
	

HTML Code:
<input type="text" name="username" value="" id="username" class="textField" placeholder="Username">

WebElement element = driver.findElement(By.cssSelector("cssexpression"));

1. Using id attribute: 
			   Syntax: #idvalue or htmltag#idvalue
				  exp: #username  or input#username

WebElement element = driver.findElement(By.cssSelector("#username"));  //or
WebElement element = driver.findElement(By.cssSelector("input#username"));

2. Using class value attribute: http://demowebshop.tricentis.com/
			   Syntax: .classvalue or htmltag.classvalue
				  exp: .textField  or input.textField

WebElement element = driver.findElement(By.cssSelector(".textField"));  //or
WebElement element = driver.findElement(By.cssSelector("input.textField"));

HTML Code:
<input type="text" class = "text Field" placeholder="Username">
	exp: .text.Field  or input.text.Field
		 .text		  or input.text
		 .Field		  or input.Field

HTML Code:
<input type = "text" class="text Field user" placeholder="Username">
	exp: .text
		 .Field
		 .user
		 .text.Field.user
		 .text.Field
		 .Field.user
		 .text.user

HTML CODE:https://www.saucedemo.com/
<input type = "submit" class="submit-button btn_action" data-test="login-button" id="login-button" name="login-button" value="Login">
	exp: 	.submit-button.btn_action  //or
			.submit-button //or
			.btn_action //or
			input.submit-button.btn_action //or
			input.submit-button //or
			input.btn_action
			
3. Using any attribute: 
			   Syntax: htmltag[attributename='attributevalue'] //or
					   htmltag[PN='PV']
			   
HTML Code:
<input type = "text" name="username" value="" id="username" class="textField" placeholder="Username">
exp: 
input[type='text']-------------->5
input[name='username'] --------->2
input[id='username']  ---------->1
input[class='textField']-------->4
input[placeholder='Username']--->3

WebElement element=driver.findElement(By.cssSelector("input[name='username']"));

HTML CODE:
<div type="submit" class="submit-button btn_action" data-test="login-button" id="login-button" value="Login"> Submit </div>

div[type='submit']
div[class='submit-button btn_action']
div[data-test='login-button']
div[id='login-button']
div[value='Login']

4. CSS with regex(handling dynamic attribute):
^ ---> start with  ==> htmltag[attributename^='attributevalue']
$ ---> ends with   ==> htmltag[attributename$='attributevalue']
* ---> contains    ==> htmltag[attributename*='attributevalue']
HTML Code:
<input type="text" name="username" id="username_95" class="textField"> //or
<input type="text" name="username" id="username_20" class="textField"> //or
<input type="text" name="username" id="username_100" class="textField">

input[id^='username_']

HTML Code:
<input type="text" name="username" id="username" class="aw-textField"> //or
<input type="text" name="username" id="username" class="qw_textField"> //or
<input type="text" name="username" id="username" class="uh*textField">
input[class$='textField']

HTML Code:
<input type="text" name="username" id="username" class="aw-textField">	//or
<input type="text" name="username" id="username" class="textField_686">	//or
<input type="text" name="username" id="username" class="uh*textField-bhy8">
input[class*='textField']

5.Direct or indirect child:
Direct: parentObjectExpression>childObjectExpression
Indirect: parentObjectExpression anychildObjectExpression

Absolute expression:
html>body>div#page>div:nth-of-type(3)>*:first-child>div>#loginFormDiv>form>div:nth-of-type(1)>input

Relative Expresssion:
html>body #loginFormDiv>form>div:nth-of-type(1)>input

form>p>input or form>p>input[name='Username'] or form>p>#username or form>p>input#username 

form input or form input[name='Username'] or form #username or form input#username

6. Based on Position:
*:first-child
*:last-child
*:nth-child(position)
htmltag:nth-of-type(position)

 
}*/