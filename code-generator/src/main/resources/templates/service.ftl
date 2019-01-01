package ${servicePackage};

import com.github.pagehelper.PageInfo;
import ${modelReference};

public interface ${serviceName} {

    ${modelName} getById(int id);

    void insertSelective(${modelName} ${modelVarName});

    void updateByIdSelective(${modelName} ${modelVarName});

    void deleteById(int id);

    PageInfo<${modelName}> list${modelName}(int pageNum, int pageSize, ${modelName} ${modelVarName});
}
