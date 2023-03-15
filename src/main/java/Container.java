public class Container {
    private int[] m_arr;
    private int m_size;
    private int m_index;

    public Container(int size)
    {
        m_arr = new int[size];
        m_index = 0;
        m_size = size;
    }

    public int getSize()
    {
        return m_size;
    }

    public boolean add(int value)
    {
        if (m_index < m_size)
        {
            m_arr[m_index] = value;
            m_index++;
            return true;
        }
        else
            return false;
    }
}
