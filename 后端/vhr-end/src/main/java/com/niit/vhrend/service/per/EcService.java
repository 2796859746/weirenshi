package com.niit.vhrend.service.per;

import com.niit.vhrend.mapper.EcMapper;
import com.niit.vhrend.model.Ec;
import com.niit.vhrend.model.RespPageBean;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EcService {
    @Autowired
    EcMapper ecMapper;
    @Autowired
    EcService ecService;
    @Autowired
    RabbitTemplate rabbitTemplate;

//    public RespPageBean getEmployeeByPage(Integer page, Integer size, Employee employee, Date[] beginDateScope) {
//        if (page != null && size != null) {
//            page = (page - 1) * size;
//        }
//        List<Employee> data = employeeMapper.getEmployeeByPage(page, size, employee, beginDateScope);
//        Long total = employeeMapper.getTotal(employee, beginDateScope);
//        RespPageBean bean = new RespPageBean();
//        bean.setData(data);
//        bean.setTotal(total);
//        return bean;
//    }

//    public Integer maxWorkId() {
//        return ecMapper.maxWorkId();
//    }

    public Integer deleteEcById(Integer id) {
        return ecMapper.deleteEcById(id);
    }

    public Integer updateEc(Ec ec) {
        return ecMapper.updateByPrimaryKeySelective(ec);
    }

    public Integer addEc(Ec ec) {

        int result = ecMapper.insertSelective(ec);
        if (result == 1) {
            //生成消息的唯一id

            Ec ec1 = new Ec();
            ec1.setId(ec1.getId());
            ec1.setName(ec1.getName());
            ec1.setSectorId(ec1.getSectorId());
            ec1.setSectorName(ec1.getSectorName());
            ec1.setThing(ec1.getThing());
            ec1.setAction(ec1.getAction());
            ec1.setWarning(ec1.getWarning());
            ec1.setDemerit(ec1.getDemerit());
            ec1.setBigDemerit(ec1.getBigDemerit());
            ec1.setCite(ec1.getCite());
            ec1.setMerit(ec1.getMerit());
            ec1.setBigMerit(ec1.getBigMerit());
            ecService.insert(ec);
        }
        return result;
    }
    public Integer insert(Ec ec) {
        return ecMapper.insert(ec);
    }

    public RespPageBean getEcByPage(Integer page, Integer size, Ec ec) {
        if (page != null && size != null) {
            page = (page - 1) * size;
        }
        List<Ec> data = ecMapper.getEcByPage(page, size, ec);
        Long total = ecMapper.getTotal(ec);
        RespPageBean bean = new RespPageBean();
        bean.setData(data);
        bean.setTotal(total);
        return bean;
    }

    public List<Ec> getAllEc() {
        return ecMapper.getAllEc();
    }


}