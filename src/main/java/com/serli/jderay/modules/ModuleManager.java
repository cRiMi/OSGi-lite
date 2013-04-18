package com.serli.jderay.modules;

import com.serli.jderay.modules.exceptions.AllreadyAddedVersionException;
import com.serli.jderay.modules.exceptions.DependenceNotFoundException;
import com.serli.jderay.modules.exceptions.InvalidModException;
import com.serli.jderay.modules.exceptions.NoMainModuleException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import org.json.simple.parser.ParseException;


/**
 *
 * @author julien
 */
public interface ModuleManager {

    /**
     * Load a module (.jar) in the module manager. 
     * @param path  Absolute path of the module without file extension.
     * @throws IOException
     * @throws ParseException
     * @throws InvalidModException
     * @throws AllreadyAddedVersionException
     */
    void loadModule(String path) throws IOException, ParseException, InvalidModException, AllreadyAddedVersionException;

    /**
     * Run the program. The method first look at dependences (check and resolve them), then search the main module and its main class. Finally, it launchs the main class.
     * @throws DependenceNotFoundException
     * @throws NoMainModuleException
     * @throws ClassNotFoundException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     */
    void run() throws DependenceNotFoundException, NoMainModuleException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException;

}