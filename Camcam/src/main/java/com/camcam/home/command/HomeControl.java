package com.camcam.home.command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.camcam.common.Control;
import com.camcam.product.service.ProductService;
import com.camcam.product.service.impl.ProductServiceImpl;
import com.camcam.product.vo.ProductVO;

public class HomeControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = "home/home";
		
		ProductService productService = new ProductServiceImpl();
		
		ArrayList<ProductVO> plist = new ArrayList<ProductVO>();
		
		req.setAttribute("plist", plist);
		
		req.getRequestDispatcher(path).forward(req, resp);

	}

}
