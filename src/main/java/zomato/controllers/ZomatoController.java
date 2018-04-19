package zomato.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import zomato.models.CityRoot;
import zomato.models.CollectionsRoot;
import zomato.services.ZomatoService;

@RestController
@RequestMapping("zomato")
public class ZomatoController {

    @Autowired
    ZomatoService zomatoService;

    @RequestMapping("/getCityID")
    public CityRoot getCityID (@RequestParam(value="city", defaultValue = "Singapore") String query){
        return zomatoService.getCityID(query);
    }

    @RequestMapping("/getCollections")
    public CollectionsRoot getCollections (@RequestParam(value="cityName", defaultValue = "Singapore") String cityName) {
        return zomatoService.getCollections(cityName);
    }

}
