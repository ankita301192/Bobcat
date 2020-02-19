package configFiles;

import com.typesafe.config.*;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public interface Config extends  ConfigMergeable{

    ConfigObject root();

    ConfigOrigin origin();

    @Override
    Config withFallback(ConfigMergeable other);

    Config resolve();

    Config resolve(ConfigResolveOptions options);

    boolean isResolved();

    Config resolveWith(Config source);

    Config resolveWith(Config source, ConfigResolveOptions options);

    void checkValid(Config reference, String... restrictToPaths);

    boolean hasPath(String path);

    boolean hasPathOrNull(String path);

    boolean isEmpty();

    Set<Map.Entry<String, ConfigValue>> entrySet();

    boolean getIsNull(String path);

    boolean getBoolean(String path);

    Number getNumber(String path);

    int getInt(String path);

    long getLong(String path);

    double getDouble(String path);

    String getString(String path);

    ConfigObject getObject(String path);

    Config getConfig(String path);

    Object getAnyRef(String path);

    ConfigValue getValue(String path);

    Long getBytes(String path);

//    ConfigMemorySize getMemorySize(String path);

    @Deprecated Long getMilliseconds(String path);

    @Deprecated Long getNanoseconds(String path);

    long getDuration(String path, TimeUnit unit);

    Duration getDuration(String path);

    ConfigList getList(String path);

    List<Boolean> getBooleanList(String path);

    List<Number> getNumberList(String path);

    List<Integer> getIntList(String path);

    List<Long> getLongList(String path);

    List<Double> getDoubleList(String path);

    List<String> getStringList(String path);

    List<? extends ConfigObject> getObjectList(String path);

    List<? extends Config> getConfigList(String path);

    List<? extends Object> getAnyRefList(String path);

    List<Long> getBytesList(String path);

//    List<ConfigMemorySize> getMemorySizeList(String path);

    @Deprecated List<Long> getMillisecondsList(String path);

    @Deprecated List<Long> getNanosecondsList(String path);

    List<Long> getDurationList(String path, TimeUnit unit);

    List<Duration> getDurationList(String path);

    Config withOnlyPath(String path);

    Config withoutPath(String path);

    Config atPath(String path);

    Config atKey(String key);

    Config withValue(String path, ConfigValue value);
}
