<%@ taglib prefix="test" uri="http://www.manning.com/sampleLib" %>
<html>
  Please enter your address and click submit<br>
  the fields marked with<test:required /> are mandatory.
  
  <form action="validateAddress.jsp" >
  <table>
  <tr>
    <td><test:required /> Street1 </td>
	<td><input type='text' name='street1'></td>
	</tr>

	<tr>
    <td>      Street2 </td>
	<td><input type='text' name='street2'></td>
	</tr>
	
	<tr>
    <td>      Street3 </td>
	<td><input type='text' name='street3'></td>
	</tr>


	<tr>
    <td><test:required /> City </td>
	<td><input type='text' name='city'></td>
	</tr>

	<tr>
    <td><test:required /> State </td>
	<td><input type='text' name='state'></td>
	</tr>

	<tr>
    <td><test:required /> Zip </td>
	<td><input type='text' name='zip'></td>
	</tr>
    </table>
	
	<input type='submit'>
	


	</form>
	
	</html>