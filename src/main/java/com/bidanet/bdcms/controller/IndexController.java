package com.bidanet.bdcms.controller;

import com.bidanet.bdcms.VersionRep;
import com.bidanet.bdcms.core.driver.cache.Cache;
import com.bidanet.bdcms.entity.User;
import com.bidanet.bdcms.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;
import java.util.ArrayList;

/**
 * Created by xuejike on 2017/2/26.
 */
@Controller
public class IndexController {



    @RequestMapping("/index")
    @ResponseBody
    public String index(){

        return "ss";
    }
}
