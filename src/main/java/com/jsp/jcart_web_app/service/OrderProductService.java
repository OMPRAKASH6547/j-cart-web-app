package com.jsp.jcart_web_app.service;

import com.jsp.jcart_web_app.dao.ProductOrderDao;
import com.jsp.jcart_web_app.dto.OrderPoduct;

public class OrderProductService {
	public OrderPoduct saveOrderProductService(OrderPoduct orderPoduct) {
		return new ProductOrderDao().saveOrderProductDao(orderPoduct);
	}
}
