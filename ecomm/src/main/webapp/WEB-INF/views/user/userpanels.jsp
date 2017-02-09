
<!-- Address -->
<div class="col-md-9 col-sm-9 col-xs-12">
	<div class="panel panel-primary">
		<div class="panel-heading">
			<div class="panel-title">Add New Address</div>
		</div>
		<div class="panel-body ">
			<c:if test="${!empty successMsg}">
				<div class="alert-msg">
					<div class="alert alert-success" role="alert">
						<strong>${successMsg}</strong>
					</div>
				</div>
			</c:if>
			<c:if test="${!empty failureMsg}">
				<div class="alert-msg">
					<div class="alert alert-danger" role="alert">
						<strong>${failureMsg}</strong>
					</div>
				</div>
			</c:if>

			<div class="col-md-offset-2 col-sm-offset-2">
				<form:form method="POST" action="${contextPath}/user/address/save"
					class="form addAddress" role="form" modelAttribute="address">
					<div class="form-group validate">
						<label for="firstName" class="control-label text-primary">First
							Name</label>
						<form:input path="firstName" class="form-control"
							placeholder="Enter Name" value="${address.firstName}" />
						<form:hidden path="id" class="form-control" value="${address.id} " />
						<%-- <form:hidden path="user" value="${user.id}" class="form-control" /> --%>
					</div>
					<div class="form-group validate">
						<label for="lastName" class="control-label text-primary">Last
							Name</label>
						<form:input path="lastName" class="form-control"
							placeholder="Enter Name" value="${address.lastName }" />
					</div>
					<div class="form-group validate">
						<label for="lineOne" class="control-label text-primary"
							id="label-text-area">Address Line 1</label>
						<form:input path="lineOne" class="form-control"
							placeholder="Enter Address Line 1" value="${address.lineOne }" />
					</div>
					<div class="form-group validate">
						<label for="lineTwo" class="control-label text-primary"
							id="label-text-area">Address Line 2</label>
						<form:input path="lineTwo" class="form-control"
							placeholder="Enter Address Line 2" value="${address.lineTwo}" />
					</div>
					<div class="form-group validate">
						<label for="landmark" class="control-label text-primary">Landmark
							(Optional)</label>
						<form:input path="landmark" class="form-control" id="landmark"
							placeholder="Enter Landmark" value="${address.landmark}" />
					</div>
					<div class="form-group validate">
						<label for="city" class="control-label text-primary">City</label>
						<form:input path="city" class="form-control" id="city"
							placeholder="Enter City" value="${address.city}" />
					</div>
					<div class="form-group validate">
						<label for="state" class="control-label text-primary">State</label>
						<form:input path="state" class="form-control" id="state"
							placeholder="Enter State" value="${address.state}" />
					</div>
					<div class="form-group validate">
						<label for="pincode" class="control-label text-primary">Pincode</label>
						<form:input path="pincode" class="form-control" id="pin"
							placeholder="Enter Pincode" value="${address.pincode }" />
					</div>
					<div class="form-group validate">
						<label for="country" class="control-label text-primary">Country</label>
						<form:input path="country" class="form-control" id="country"
							placeholder="Enter Pincode" value="India" disabled="disabled" />
					</div>

					<div class="form-group validate">
						<label for="mobileNumber" class="control-label text-primary">Phone
							Number</label>
						<form:input path="mobileNumber" class="form-control"
							id="phoneNumber" placeholder="Enter Phone Number"
							value="${address.mobileNumber }" />
					</div>
					<div class="form-group">
						<input type="submit"
							class="btn btn-primary col-md-offset-3 col-sm-offset-3"
							id="saveAddress" value="Add Address">
					</div>
				</form:form>
			</div>
			<div class="col-md-12 col-sm-12 col-xs-12">
				<h6>
					<strong>Your Saved Address</strong>
				</h6>
			</div>
			<c:forEach items="${addresses}" var="address">
				<div class=" col-md-5 col-sm-12 col-xs-12">
					<div class="thumbnail nopadding default-border">
						<div class="well no-bottom-margin">
							<div class="caption">
								<address>
									<Strong>${address.firstName} ${address.lastName}</Strong><br>
									${address.lineOne },<br> ${address.lineTwo },<br>${address.landmark},<br>${address.city}
									- ${address.pincode}<br> ${address.state}<br> <abbr
										title="Phone">Ph:</abbr> ${address.mobileNumber}
								</address>
								<c:choose>
									<c:when test="${address.defaultAddress == true }">
										<input type="radio" name="default" class="defaultAddress"
											id="${address.id}" checked="checked">Default Address
								</c:when>
									<c:otherwise>
										<input type="radio" name="default" class="defaultAddress"
											id="${address.id}">Default Address
								</c:otherwise>
								</c:choose>
								<br> <a
									href="${contextPath}/user/address/edit/${address.id}">Edit</a>
								| <a href="${contextPath}/user/address/delete/${address.id}">Delete</a>
							</div>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</div>

<!-- cart -->
<div class="panel panel-primary">
	<c:choose>
		<c:when test="${not empty cartItems }">
			<div class="panel-heading" style="font-size: 20px;">Cart(${cart.numberOfCartItems})</div>
			<div class="panel-body">

				<c:if test="${!empty successMsg}">
					<div class="alert-msg">
						<div class="alert alert-success" role="alert">
							<strong>${successMsg}</strong>
						</div>
					</div>
				</c:if>
				<c:if test="${!empty failureMsg}">
					<div class="alert-msg">
						<div class="alert alert-danger" role="alert">
							<strong>${failureMsg}</strong>
						</div>
					</div>
				</c:if>

				<table class="table">
					<thead>
						<tr>
							<td>ITEM</td>
							<td>QTY</td>
							<td>PRICE</td>
							<td>DELIVERY DETAILS</td>
							<td>SUBTOTAL</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${cartItems}" var="cartItem">
							<tr>
								<%--item column --%>
								<td class="col-md-7">
									<div class="col-md-1 nopadding">
										<img src="${images}/product/${cartItem.product.id}.png"
											style="height: 100px; width: 75px;">
									</div>
									<div class="col-md-11">
										${cartItem.product.productName}<br />
										<div class="text-muted">${cartItem.product.description}</div>
										<div class="text-right">
											<a href="${contextPath}/user/wishlist/move/${cartItem.id}"
												class="btn btn-info">Move To Wishlist</a> <a
												href="${contextPath}/user/cart/delete/${cartItem.id}"
												class="btn btn-danger">Remove</a>
										</div>
									</div>
								</td>
								<%--item column Ends here --%>

								<%-- QTY Column Starts Here--%>
								<td><form:form method="POST"
										action="${contextPath}/user/cart/update"
										modelAttribute="cartItem">
										<div class="form-group">
											<form:input id="${cartItem.id}" path="quantity"
												placeholder="1" class="form-control text-center quantity"
												style="max-width: 30px;" value="${cartItem.quantity}" />
											<form:hidden path="id" value="${cartItem.id}" />
											<input type="submit" class="btn btn-primary"
												id="btn_${cartItem.id}" value="save" id="Test"
												style="display: none;">
										</div>
									</form:form></td>
								<%-- QTY Column Ends Here--%>
								<%--Price Column Starts Here --%>
								<td>
									<div style="font-color: black; font-size: 16px;">&#8377;${cartItem.itemPrice}</div>
								</td>
								<%--Price Column Starts Here --%>
								<td>
									<div class="text-info" style="font-weight: bold;">Free</div>
								</td>
								<td>
									<div
										style="font-color: black; font-weight: bold; font-size: 16px;">
										&#8377;${cartItem.totalPrice }</div>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="text-right well"
					style="margin-top: -20px; font-size: 25px;">Amount Payable:
					&ensp;&#8377;${cart.grandTotal}</div>
				<div class="text-right">
					<a href="${contextPath}/" class="btn-lg btn-default">< Continue
						Shopping</a> <a href="${contextPath}/addressList"
						class="btn-lg btn-warning">Place Order</a>
				</div>
			</div>
		</c:when>
		<c:otherwise>
			<div class="panel-body">
				<h3>No Items Present In Cart</h3>
			</div>
		</c:otherwise>
	</c:choose>
</div>

<!-- change password -->
<div class="col-md-9 col-sm-9 col-xs-12">
	<div class="panel panel-primary">
		<div class="panel-heading">
			<div class="panel-title">Change Password</div>
		</div>

		<c:if test="${!empty successMsg}">
			<div class="alert-msg">
				<div class="alert alert-success" role="alert">
					<strong>${successMsg}</strong>
				</div>
			</div>
		</c:if>
		<c:if test="${!empty failureMsg}">
			<div class="alert-msg">
				<div class="alert alert-danger" role="alert">
					<strong>${failureMsg}</strong>
				</div>
			</div>
		</c:if>
		<c:if test="${!empty wrongMsg}">
			<div class="alert-msg">
				<div class="alert alert-info" role="alert">
					<strong>${wrongMsg}</strong>
				</div>
			</div>
		</c:if>

		<div class="panel-body col-md-offset-3 col-sm-offset-3 ">
			<form:form class="form changePassword" role="form"
				modelAttribute="user" method="POST"
				action="${contextPath}/user/update/password">
				<div class="col-md-9 col-sm-12 col-xs-12">
					<label for="oldPassword" class="text-primary">Old Password</label>
					<div class="form-group validate">
						<form:password path="oldPassword" class="form-control"
							placeholder="Enter Old Password" />
						<form:hidden path="id" value="${user.id}" />
					</div>
					<label for="newPassword " class="text-primary">New Password</label>
					<div class="form-group validate">
						<form:password path="password" placeholder="Enter New Password"
							class="form-control" />
					</div>
					<label for="reTypeNewPassword" class="text-primary">Re-Type
						New Password</label>

					<div class="form-group validate">
						<form:password path="confirmPassword" class="form-control"
							id="reTypeNewPassword" placeholder="Re-Type New Password" />
					</div>
					<div class="form-group">
						<input type="submit"
							class="btn btn-primary col-md-4 col-sm-4 col-xs-6 col-md-offset-4 col-sm-offset-4 col-xs-offset-4"
							value="Save">
					</div>
				</div>
			</form:form>
		</div>
	</div>
</div>
</div>

<!-- menu -->
<div class="col-md-3 col-sm-3 hidden-xs">
	<div class="panel panel-primary">
		<div class="panel-heading">
			<div class="panel-title">
				<b>My Account</b>
			</div>
		</div>
		<ul class="nav navbar-pills nav-stacked">
		<li><div class="panel-heading">
				<div class="panel-title">
					<b>My Stuff</b>
				</div>
			</div></li>
			<li id = "wishList"><a href="${contextPath}/user/wishlist/show">Wish List</a></li>
			<li><div class="panel-heading">
				<div class="panel-title">
					<b>SETTINGS</b>
				</div>
			</div></li>
			<li id="personalInformation"><a href="${contextPath}/user/personalinformation">Personal Information</a></li>
			<li id="changePassword"><a href="${contextPath}/user/changepassword">Change Password</a></li>
			<li id="addresses"><a href="${contextPath}/user/addresses">Addresses</a></li>
			<li id="update"><a href="${contextPath}/user/updateemailmobile">Update Mobile/Email</a></li>
		</ul>
	</div>
</div>

<!-- order -->
<div class="col-md-12 col-sm-12 col-xs-12">
	<c:choose>
		<c:when test="${not empty orders }">
			<c:forEach items="${orders}" var="order">
				<div class="panel">
					<div class="panel-primary">
						<div class="panel-heading">${order.id }</div>
					</div>
					<div class="panel-body">
						<table class="table">
							<tbody>
								<c:forEach items="${order.orderItems}" var="orderItem">
									<tr>
										<td><div class="col-md-1" style="padding: 0px;">
												<img src="${images}/product/${orderItem.product.id}.png"
													style="height: 100px; width: 50px;"></td>
										<td><strong>${orderItem.product.productName }</strong><br>
											${orderItem.product.description}</td>
										<td><small><span class="text-muted">Quantity
													: ${orderItem.quantity}</span></small></td>
										<td>&#8377;${orderItem.totalPrice}</td>
									</tr>
								</c:forEach>
								<tr>
									<td colspan="4">
										<div class="well nomargin">
											<div class="text-right">
												<strong>Paid: &#8377;${order.grandTotal} <sub>through
														${order.paymentMode}</sub></strong>
											</div>
										</div>
									</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</c:forEach>
		</c:when>
		<c:otherwise>
			<div class="panel">
				<div class="panel-body">
					<h3>No Orders Yet!</h3>
				</div>
			</div>
		</c:otherwise>
	</c:choose>
</div>

<!-- personal information -->
<div class="col-md-9 col-sm-9 col-xs-12">
	<div class="panel panel-primary">
		<div class="panel-heading">
			<div class="panel-title">Personal Information</div>
		</div>

		<c:if test="${!empty successMsg}">
			<div class="alert-msg">
				<div class="alert alert-success" role="alert">
					<strong>${successMsg}</strong>
				</div>
			</div>
		</c:if>

		<c:if test="${!empty failureMsg}">
			<div class="alert-msg">
				<div class="alert alert-danger" role="alert">
					<strong>${failureMsg}</strong>
				</div>
			</div>
		</c:if>

		<div class="panel-body col-md-offset-3 col-sm-offset-3">
			<form:form id="information" class="form"
				action="${contextPath}/user/update/personalinformation"
				method="POST" modelAttribute="user">
				<div class="col-md-9 col-sm-9 col-xs-9">
					<label for="firstName" class="text-primary ">First Name</label>
					<div class="form-group validate">
						<form:input path="firstName" class="form-control"
							placeholder="Enter First Name" id="firstName"
							value="${user.firstName}" />
						<form:hidden path="id" value="${user.id}" disable="disable" />
					</div>
					<label for="lastName" class="text-primary ">Last Name</label>
					<div class="form-group validate">
						<form:input path="lastName" class="form-control"
							placeholder="Last Name" id="lastName" value="${user.lastName}" />
					</div>
					<div class="form-group">
						<label for="gender" class="text-primary">Gender</label>
						<div class="validate">
							<div class="gender">
								<select class="form-control" name="gender">
									<c:if test="${user.gender == 'Female' }">
										<option value="${user.gender }">${user.gender }</option>
										<option value="Male">Male</option>
									</c:if>
									<option value="${user.gender }">${user.gender }</option>
									<option value="Female">Female</option>
								</select>
							</div>
						</div>
					</div>

					<div class="form-group">
						<input type="submit"
							class="btn btn-primary col-md-4 col-sm-6 col-xs-8 col-md-offset-4 col-sm-offset-4"
							value="Save">
					</div>
				</div>
			</form:form>
		</div>
	</div>
</div>

<!-- update emailmobile -->
<div class="col-md-9 col-sm-9 col-xs-12">
	<div class="panel panel-primary">
		<div class="panel-heading">
			<div class="panel-title">Update Email/Mobile</div>
		</div>
		<c:if test="${!empty successMsg}">
			<div class="alert-msg">
				<div class="alert alert-success" role="alert">
					<strong>${successMsg}</strong>
				</div>
			</div>
		</c:if>
		<c:if test="${!empty failureMsg}">
			<div class="alert-msg">
				<div class="alert alert-danger" role="alert">
					<strong>${failureMsg}</strong>
				</div>
			</div>
		</c:if>

		<div
			class="panel-body col-md-offset-3 col-sm-offset-3 col-xs-offset-3">
			<form:form action="${contextPath}/user/update/address"
				modelAttribute="user" class="form">
				<div class="col-md-9 col-sm-9 col-xs-9">
					<!-- <label for="email" class="text-primary label-size">E-Mail</label>
					<div class="form-group">
						<form:input path="email" class="form-control"
							placeholder="Enter E-Mail"/>
					</div> -->
					<form:hidden path="id" value="${user.id}" />
					<label for="mobile" class="text-primary label-size">Mobile</label>

					<div class="form-group">
						<form:input path="mobileNumber" class="form-control"
							placeholder="Enter Mobile Number" />
					</div>
					<div class="form-group">
						<input type="submit"
							class="btn btn-primary col-md-4 col-sm-4 col-xs-4 col-md-offset-3 col-sm-offset-3 col-xs-offset-3"
							value="Save">
					</div>
				</div>
			</form:form>
		</div>
	</div>
</div>

<!-- wishlist -->
<div class="col-md-9 col-sm-9 col-xs-12">
	<div class="panel panel-body">
		<c:choose>
			<c:when test="${not empty items }">
				<c:forEach items="${items }" var="item">
					<table class="table">
						<tbody>
							<tr>
								<td>
									<div class="col-md-2" style="padding: 0px;">
										<img alt="${item.product.productName}"
											src="${images}/product/${item.product.id}.png"
											style="height: 150px; width: 100px;">
									</div>
								</td>

								<td><a href="${contextPath}/product/${item.product.id}"><span
										class="lead">${item.product.productName}</span></a><br>
									${item.product.description }</td>

								<td>
									<div class="text-right">
										<span class="lead"> <strong>&#8377;${item.product.price }</strong></span><br>
										<br> <a href="${contextPath}/user/cart/move/${item.id}"
											class="btn btn-info">Move To Cart</a><br> <br> <a
											href="${contextPath}/user/cart/delete/${item.id}"
											class="btn btn-danger">Delete</a>
									</div>
								</td>

							</tr>


						</tbody>
					</table>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<h3>No Items Present In Your WishList</h3>
			</c:otherwise>
		</c:choose>
	</div>
</div>