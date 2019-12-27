package com.sxh.newfolder.DP11_外观模式.DP_11;

import com.sxh.newfolder.DP11_外观模式.DP_11.ModuleA.FacadeA;
import com.sxh.newfolder.DP11_外观模式.DP_11.ModuleB.FacadeB;

/**
 *
 * 外观模式AB ====> 聚合模块A和模块B的功能
 * @author sxh
 * @date 2019/12/27
 */
public class FacadeAB {
    private FacadeA facadeA;
    private FacadeB facadeB;

    public FacadeAB() {
        this.facadeA = new FacadeA();
        this.facadeB = new FacadeB();
    }

    public void startSystem() {
        facadeA.initialize();
        facadeB.work();
    }
}
