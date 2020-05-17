package com.niit.vhrend.service.per;

import com.niit.vhrend.mapper.SectorMapper;
import com.niit.vhrend.model.Nation;
import com.niit.vhrend.model.Sector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectorService {
    @Autowired
    SectorMapper sectorMapper;
    public List<Sector> getAllSector() {
        return sectorMapper.getAllSector();
    }
}
