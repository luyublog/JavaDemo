package algorithm.backtrace;

/**
 * 动态规划
 * 爬楼梯问题展示了如何通过子问题分解来求解原问题的。实际上，子问题分解是一种通用的算法思路，在分治、动态规划、回溯中的侧重点不同。
 * 1.分治算法递归地将原问题划分为多个相互独立的子问题，直至最小子问题，并在回溯中合并子问题的解，最终得到原问题的解。
 * <p>
 * 2.动态规划也对问题进行递归分解，但与分治算法的主要区别是，动态规划中的子问题是相互依赖的，在分解过程中会出现许多重叠子问题。
 * <p>
 * 3.回溯算法在尝试和回退中穷举所有可能的解，并通过剪枝避免不必要的搜索分支。原问题的解由一系列决策步骤构成，我们可以将每个决策步骤之前的子序列看作一个子问题。
 * <p>
 * 实际上，动态规划常用来求解最优化问题，它们不仅包含重叠子问题，还具有另外两大特性：最优子结构、无后效性。
 * <p>
 * 最优子结构: 原问题的最优解是从子问题的最优解构建得来的。
 * 无后效性: 给定一个确定的状态，它的未来发展只与当前状态有关，而与过去经历的所有状态无关。
 *
 * 关键点： 状态转移方程+目标因素+DP定义
 *
 * @author: east
 * @date: 2024/1/10
 */
public class Dp {

}
