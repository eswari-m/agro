package com.jsp.Argo_boot_4.dao;

import com.jsp.Argo_boot_4.entity.Image;
import com.jsp.Argo_boot_4.entity.Post;
import com.jsp.Argo_boot_4.repo.ImageRepo;
import com.jsp.Argo_boot_4.repo.PostRepo;

public class ImageDao {
	ImageRepo repo;
	   public Image save(Image image) {
		   return repo.save(image);
	}
}
