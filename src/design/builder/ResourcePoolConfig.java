package design.builder;

/**
 * <>建造者模式</>
 * 如果构造函数参数过多，我们就需要考虑使用建造者模式，先设置建造者的变量，然后再一次性地创建对象，让对象一直处于有效状态。
 */
public class ResourcePoolConfig
{

    private String name;

    private int maxTotal;

    private int maxIdle;

    private int minIdle;

    private ResourcePoolConfig(Builder builder)
    {
        this.name = builder.name;
        this.maxTotal = builder.maxTotal;
        this.maxIdle = builder.maxIdle;
        this.minIdle = builder.minIdle;
    }

    @Override
    public String toString()
    {
        return "ResourcePoolConfig{" +
                "name='" + name + '\'' +
                ", maxTotal=" + maxTotal +
                ", maxIdle=" + maxIdle +
                ", minIdle=" + minIdle +
                '}';
    }

    public static class Builder
    {
        private static final int DEFAULT_MAX_TOTAL = 8;
        private static final int DEFAULT_MAX_IDLE = 8;
        private static final int DEFAULT_MIN_IDLE = 0;
        private String name;
        private int maxTotal = DEFAULT_MAX_TOTAL;
        private int maxIdle = DEFAULT_MAX_IDLE;
        private int minIdle = DEFAULT_MIN_IDLE;

        public Builder setName(String name)
        {
            if (name == null)
            {
                throw new IllegalArgumentException("name should not be null");
            }
            this.name = name;
            return this;
        }

        public Builder setMaxTotal(int maxTotal)
        {
            if (maxTotal < 0)
            {
                throw new IllegalArgumentException("maxTotal should be larger than 0");
            }
            this.maxTotal = maxTotal;
            return this;
        }

        public Builder setMaxIdle(int maxIdle)
        {
            if (maxIdle < 0)
            {
                throw new IllegalArgumentException("maxIdle should be larger than 0");
            }
            this.maxIdle = maxIdle;
            return this;
        }

        public Builder setMinIdle(int minIdle)
        {
            if (minIdle < 0)
            {
                throw new IllegalArgumentException("minIdle should be larger than 0");
            }
            this.minIdle = minIdle;
            return this;
        }

        public ResourcePoolConfig build()
        {
            if (this.maxIdle <= this.maxTotal && this.minIdle <= this.maxIdle)
            {
                return new ResourcePoolConfig(this);
            }
            else
            {
                throw new IllegalArgumentException("...");
            }
        }

    }

}
