package com.sxh.newfolder.DP10_代理模式.Dp_10.VP_虚拟代理;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 领导身边的秘书 === 将领导作为被代理的对象，但是会延缓被代理对象的创建时间，最后实现去签订接口
 * @author sxh
 * @date 2019/12/26
 */
public class Secretary implements Signable {

    private List<String> deals;
    private Leader leader;

    public Secretary() {
        deals = new LinkedList<>();
    }

    /**
     * 添加一份合同
     */
    public void addDeal(String deal) {
        // 领导不在的话，秘书先揽收
        if (leader == null) {
            this.deals.add(deal);
            System.out.println("领导不在，秘书揽收了合同：" + deal);
        } else { // 否则，直接交给领导处理
            leader.addDeal(deal);
            System.out.println("领导亲自揽收了合同：" + deal);
        }
    }

    @Override
    public void sign() {
        if (leader == null) { // 领导不在，秘书无权签署文件，等待领导上线
            System.out.println("领导不在，请稍等...");
        } else { // 否则，领导将秘书揽收的文件都拿过来
            this.leader.addDeals(this.deals);
            this.leader.sign();
        }
    }

    static class LeadFactory {
        public static Leader getLeader() {
            return new Leader();
        }
    }

    public void initLeader(int second) {
        int n = 0;
        do {
            System.out.println("等待领导出现" + (++n) + "秒");
        } while (--second>0);
        this.leader = LeadFactory.getLeader();
    }
}
