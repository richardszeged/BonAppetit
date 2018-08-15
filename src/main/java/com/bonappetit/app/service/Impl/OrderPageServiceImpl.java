package com.bonappetit.app.service.Impl;

import com.bonappetit.app.errors.MenuNotFoundException;
import com.bonappetit.app.model.menuSection.Menu;
import com.bonappetit.app.repository.MenuRepository;
import com.bonappetit.app.service.OrderPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderPageServiceImpl implements OrderPageService {

    @Autowired
    private MenuRepository menuRepository;

    @Override
    public Menu getMenuById(String id) throws MenuNotFoundException {
       return menuRepository.findById(id).orElseThrow(() -> new MenuNotFoundException("not found"));
    }
}