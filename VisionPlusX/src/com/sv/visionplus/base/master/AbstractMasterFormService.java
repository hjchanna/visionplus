/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.base.master;

import com.sv.visionplus.system.exception.VPException;
import java.util.List;

/**
 *
 * @author Mohan
 */
public abstract class AbstractMasterFormService<T> {

    private final AbstractMasterFormDAO<T> masterFormDAO;

    protected abstract AbstractMasterFormDAO<T> getMasterFormDAO();

    public AbstractMasterFormService() {
        this.masterFormDAO = getMasterFormDAO();
    }

    public void save(T object) throws VPException {

    }

    public void update(T object) throws VPException {

    }

    public void delete(T object) throws VPException {

    }

    public List<T> getSearchResult(String text) {
        return null;
    }
}
