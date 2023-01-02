package id.batch7.demoSpring.services.category;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import id.batch7.demoSpring.repositories.CategoryRepository;
import id.batch7.demoSpring.models.dto.request.CategoryRequest;
import id.batch7.demoSpring.models.dto.response.ResponseData;
import id.batch7.demoSpring.models.entity.Category;
import id.batch7.demoSpring.validators.CategoryValidator;

public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryValidator categoryValidator;

    private Category category;
    private ResponseData responseData;
    private List<Category> categories;

    @Override
    public ResponseData createCategoryService(CategoryRequest request) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ResponseData readCategorysService(Boolean status) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ResponseData readCategoryService(Long id) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ResponseData updateCategoryService(Long id, CategoryRequest request) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ResponseData deleteCategoryService(Long id) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
    
}
