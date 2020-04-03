package com.ruoyi.web.controller.matlab.dsp;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/matlab/dsp/fourierTransf")
public class FourierTransfController {
    private String prefix = "/matlab/dsp/fourierTransf";

    @RequiresPermissions("matlab:dsp:fourierTransf:view")
    @GetMapping()
    public String fourierTransf()
    {
        return prefix + "/fourierTransf";
    }
}
