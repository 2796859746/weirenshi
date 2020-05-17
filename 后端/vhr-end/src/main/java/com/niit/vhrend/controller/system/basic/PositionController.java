package com.niit.vhrend.controller.system.basic;

import com.niit.vhrend.model.Position;
import com.niit.vhrend.model.RespBean;
import com.niit.vhrend.service.system.basic.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Lenovo
 */
@RestController
@RequestMapping("/system/basic/pos")
public class PositionController {
    @Autowired
    PositionService positionService;

    @GetMapping("/")
    public RespBean getAllPositions(){
        List<Position> positions = positionService.getAllPositions();
        return RespBean.ok("获取成功",positions);
    }
    @PostMapping("/")
    public RespBean addPosition(@RequestBody Position position){
        if (positionService.addPosition(position)==1){
            return RespBean.ok("添加成功");
        }
        return RespBean.error("添加失败");
    }
    @PutMapping("/")
    public RespBean updatePositions(@RequestBody Position position){
        if (positionService.updatePositions(position)==1){
            return RespBean.ok("更新成功");
        }
        return RespBean.error("更新失败");
    }
    @DeleteMapping("/{id}")
    public RespBean deletePositionById(@PathVariable Integer id) {
        if (positionService.deletePositionById(id) == 1) {
            return RespBean.ok("删除成功!");
        }
        return RespBean.error("删除失败!");
    }

    @DeleteMapping("/")
    public RespBean deletePositionsByIds(Integer[] ids) {
        if (positionService.deletePositionsByIds(ids) == ids.length) {
            return RespBean.ok("删除成功!");
        }
        return RespBean.error("删除失败!");
    }
}
