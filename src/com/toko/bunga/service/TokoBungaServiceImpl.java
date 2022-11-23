/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.toko.bunga.service;

import com.toko.bunga.dao.TokoBungaDao;
import com.toko.bunga.model.TokoBunga;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Anas
 */
@Service("TokoBungaService")
@Transactional(readOnly = true)
public class TokoBungaServiceImpl implements TokoBungaService {
    @Autowired
    private TokoBungaDao tokoBungaDao;

    @Override
    public void save(TokoBunga tokobunga) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        tokoBungaDao.save(tokobunga);
    }

    @Override
    public void update(TokoBunga tokobunga) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        tokoBungaDao.update(tokobunga);
    }

    @Override
    public void delete(TokoBunga tokobunga) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        tokoBungaDao.delete(tokobunga);
    }

    @Override
    public List<TokoBunga> getList() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return tokoBungaDao.getList();
    }
    
}