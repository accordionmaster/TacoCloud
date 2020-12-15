package tacos.data;

import tacos.Ingredient;

/**
 * 定义JDBC repository
 * 我们的IngredientRepository 需要完成如下操作
 * 1.查询所有的配料信息，将它们放在一个ingredient集合中
 * 2.根据id，查询单个Ingredient
 * 3.保存Ingredient对象
 */
public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);

}
