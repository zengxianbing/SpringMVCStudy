package com.zxb.web.controller.annotation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Controller
@RequestMapping("/file")
public class UploadController {
	@RequestMapping("/upload")
	public String upload(@RequestParam("file") CommonsMultipartFile file,
			HttpServletRequest request) throws FileNotFoundException {

		System.out.println("fileName---->" + file.getOriginalFilename());

		if (!file.isEmpty()) {

			try {
				FileOutputStream os = new FileOutputStream("F:/"
						+ new Date().getTime() + file.getOriginalFilename());
				InputStream in = file.getInputStream();
				int b = 0;
				while ((b = in.read()) != -1) {

					os.write(b);
				}
				os.flush();
				os.close();
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return "success";

	}

	@RequestMapping("/upload2")
	public String upload2(HttpServletRequest request,
			HttpServletRequest response) {

		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		if (multipartResolver.isMultipart(request)) {
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;

			Iterator<String> iter = multiRequest.getFileNames();
			while (iter.hasNext()) {

				MultipartFile file = multiRequest.getFile((String) iter.next());
				if (file != null) {

					String fileName = "demoUpload" + file.getOriginalFilename();
					String path = "D:/" + fileName;
					File localFile = new File(path);
					try {
						file.transferTo(localFile);
					} catch (IllegalStateException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			
			}
		
		}
		return "/success";
	}

}
