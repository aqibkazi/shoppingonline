<div class="tab-content clearfix">
				<!--Add Product-->
				<div class="tab-pane active" id="Product">
					<h3 class="text-center">
						<small style="font-size: 23px"><span
							class="fa fa-database"></span></small>&nbsp; Add Your Product
					</h3>
					<hr class="small">
					<div class="col-md-2">
						<!--<span class="fa fa-user-circle-o" style="font-size:250px"></span>-->
					</div>
					<div class="col-md-8">
						<div class="well">
							<form>
								<div class="row">

									<div class="col-md-1"></div>

									<div class="col-md-10">
									
										<div class="form-group">
											<label for="username"> Product Name </label>
											<div class="input-group">
												<span class="input-group-addon"><span
													class="fa fa-shopping-cart"></span> </span> <input type="text"
													class="form-control" id="product"
													placeholder="Enter Product Name" required="required" />
											</div>
										</div>

										<div class="form-group">
											<label for="username"> Choose a Category </label>
											<div class="input-group">
					 							<span class="input-group-addon"><span
													class="fa fa-shopping-cart"></span> </span> <select id="category"
													name="category" class="form-control" required="required">
													<option value="na" selected="">Add a Category </option>
													<option value="1">shirt</option>
													<option value="2">t-shirt</option>
													<option value="3">Jeans</option>
												</select>
											</div>
										</div>

										<div class="form-group">
											<label for="username"> Choose a Seller </label>
											<div class="input-group">
												<span class="input-group-addon"><span
													class="fa fa-code"></span> </span> <select id="developer"
													name="developer" class="form-control" required="required">
													<option value="na" selected="">Add a Seller </option>
													<option value="1"></option>
													<option value="2"></option>
												</select>
											</div>
										</div>

										<div class="form-group">
											<label for="username"> Set a Price </label>
											<div class="input-group">
												<span class="input-group-addon"><span
													class="fa fa-inr"></span> </span> <input type="text"
													class="form-control" id="product"
													placeholder="Enter a Price" required="required" />
											</div>
										</div>
										
										<div class="form-group">
											<label for="username"> Set Product Quantity </label>
										 <td class="product-quantity">
                                <input type="number" value="1" min="1" class="fl qty-text" name="quantity">
                            </td>
	
									
										<div class="form-group">
											<label for="username"> Add a Product Description </label>
											<div class="input-group">
												<span class="input-group-addon"><span
													class="fa fa-info"></span> </span>
												<textarea name="message" id="message" class="form-control"
													rows="3" cols="25" required="required"
													placeholder="Message"></textarea>
											</div>
										</div>

										<div class="form-group">
											<label for="exampleInputFile">Add a Cover Photo</label> <input
												type="file" id="exampleInputFile" class="form-control">
										</div>

										<!--<div class="form-group">
                            <label for="exampleInputFile">Upload a Templete</label>
                            <input type="file" id="exampleInputFile" class="form-control">
                        </div>-->

									</div>
									<div class="col-md-12 text-center">
										<button id="B6size" type="submit" class="btn btn-primary"
											id="btnSignup">Add Product</button>
										&nbsp;
										<button id="B6size" type="reset" class="btn btn-primary"
											id="btnReset">Reset</button>
									</div>
								</div>
							</form>
						</div>
					</div>

				 <!-- Trigger the modal with a button -->
  <div class="col-md-12 text-center">
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">View All Product</button>

  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">View All Product</h4>
        </div>
        <div class="modal-body">
          <p>View Your Product Here</p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
        </div>
      </div>
    </div>
  </div>
</div>
	</div>

				</div>

			</div>
		</div>
	</div>
</div>
	


				