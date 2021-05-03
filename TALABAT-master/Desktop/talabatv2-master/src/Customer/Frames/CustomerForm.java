/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer.Frames;

import com.company.Main.Category;
import com.company.Main.Meal;
import static com.company.Main.Meal.getMealList;
import com.company.Main.Restaurant;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicScrollBarUI;

/**
 *
 * @author LENOVO
 */
public class CustomerForm extends javax.swing.JFrame {

    /**
     * Creates new CustomerForm CustomerForm
     */
    Random rand = new Random();
    int mousepX;
    int mousepY;
    int cat_choice = 0;
    int restaurant_choice = 0;
    int meal_choice = 0;
    int random_color;

    OrderMeal order = new OrderMeal();
    JPanel restaurant_panels[] = new JPanel[20];
    JLabel[] restaurant_labels = new JLabel[20];
    JPanel panels[] = new JPanel[20];
    JLabel[] labels = new JLabel[20];
    JPanel meal_panels[] = new JPanel[20];
    JLabel[] meal_labels = new JLabel[20];

    public int getMeal_choice() {
        return meal_choice;
    }

    public CustomerForm() {

        initComponents();
        displayCategory();
        displayAllRestaurants();
        displayCategorizedRestaurants(Category.getCategoryList().get(cat_choice));

        sc.getVerticalScrollBar().setBackground(Color.BLACK);

        sc.getHorizontalScrollBar().setBackground(Color.BLACK);

        sc.getHorizontalScrollBar().setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new java.awt.Color(35, 35, 35);
            }
        });
        sc1.getVerticalScrollBar().setBackground(Color.BLACK);

        sc1.getHorizontalScrollBar().setBackground(Color.BLACK);

        sc1.getHorizontalScrollBar().setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new java.awt.Color(35, 35, 35);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        categories = new javax.swing.JPanel();
        sc = new javax.swing.JScrollPane();
        sc_categories = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        restaurants = new javax.swing.JPanel();
        sc1 = new javax.swing.JScrollPane();
        sc_restaurants = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cart = new javax.swing.JPanel();
        categoized_restaurants_f = new javax.swing.JPanel();
        sc_meals = new javax.swing.JPanel();
        home = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(24, 24, 24));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(24, 24, 24));

        jLabel2.setBackground(new java.awt.Color(24, 24, 24));
        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HOME");
        jLabel2.setToolTipText("");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 115, -1, -1));

        jPanel7.setBackground(new java.awt.Color(24, 24, 24));

        jLabel3.setBackground(new java.awt.Color(24, 24, 24));
        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CATEGORIES");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        jPanel8.setBackground(new java.awt.Color(24, 24, 24));

        jLabel4.setBackground(new java.awt.Color(24, 24, 24));
        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("RESTAURANTS");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 307, -1, -1));

        jPanel9.setBackground(new java.awt.Color(24, 24, 24));

        jLabel5.setBackground(new java.awt.Color(24, 24, 24));
        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CART");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 402, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 340, 600));

        jPanel2.setBackground(new java.awt.Color(24, 24, 24));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(74, 74, 74));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("x");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 60, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 80));

        jPanel10.setBackground(new java.awt.Color(102, 255, 153));
        jPanel10.setLayout(new java.awt.CardLayout());

        categories.setBackground(new java.awt.Color(24, 24, 24));

        sc.setBorder(null);
        sc.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        sc_categories.setBackground(new java.awt.Color(24, 24, 24));
        sc.setViewportView(sc_categories);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Customer/Frames/talabat logo.png"))); // NOI18N

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Corbel", 0, 38)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("CATEGORIES ");

        javax.swing.GroupLayout categoriesLayout = new javax.swing.GroupLayout(categories);
        categories.setLayout(categoriesLayout);
        categoriesLayout.setHorizontalGroup(
            categoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoriesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(categoriesLayout.createSequentialGroup()
                .addComponent(sc)
                .addContainerGap())
        );
        categoriesLayout.setVerticalGroup(
            categoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, categoriesLayout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addGroup(categoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, categoriesLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(10, 10, 10)))
                .addComponent(sc, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );

        jPanel10.add(categories, "card3");

        restaurants.setBackground(new java.awt.Color(24, 24, 24));

        sc1.setBorder(null);
        sc1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        sc_restaurants.setBackground(new java.awt.Color(24, 24, 24));
        sc1.setViewportView(sc_restaurants);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Customer/Frames/talabat logo.png"))); // NOI18N

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Corbel", 0, 38)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("RESTAURANTS");

        javax.swing.GroupLayout restaurantsLayout = new javax.swing.GroupLayout(restaurants);
        restaurants.setLayout(restaurantsLayout);
        restaurantsLayout.setHorizontalGroup(
            restaurantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restaurantsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(restaurantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sc1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                    .addGroup(restaurantsLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        restaurantsLayout.setVerticalGroup(
            restaurantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, restaurantsLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(restaurantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, restaurantsLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(10, 10, 10)))
                .addComponent(sc1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
        );

        jPanel10.add(restaurants, "card4");

        javax.swing.GroupLayout cartLayout = new javax.swing.GroupLayout(cart);
        cart.setLayout(cartLayout);
        cartLayout.setHorizontalGroup(
            cartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        cartLayout.setVerticalGroup(
            cartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jPanel10.add(cart, "card5");

        categoized_restaurants_f.setBackground(new java.awt.Color(24, 24, 24));
        jPanel10.add(categoized_restaurants_f, "card6");

        sc_meals.setBackground(new java.awt.Color(24, 24, 24));
        jPanel10.add(sc_meals, "card7");

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jPanel10.add(home, "card5");

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 690, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void displayCategory() {

        ArrayList<Category> arr_categories = Category.getCategoryList();

        for (int i = 0; i < arr_categories.size(); i++) {

            random_color = rand.nextInt(50);

            panels[i] = new javax.swing.JPanel(new GridBagLayout());
            panels[i].setBackground(new java.awt.Color(150 + random_color, 30 + random_color, 50));
            panels[i].setPreferredSize(new Dimension(370, 270));
            panels[i].addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {

                    for (int i = 0; i < arr_categories.size(); i++) {
                        if (evt.getSource() == panels[i]) {
                            cat_choice = i;
                        }

                    }
                    categoized_restaurants_f.setVisible(true);
                    sc_meals.setVisible(false);
                    home.setVisible(false);
                    categories.setVisible(false);
                    cart.setVisible(false);
                    restaurants.setVisible(false);
                    displayCategorizedRestaurants(Category.getCategoryList().get(cat_choice));
                }

            });

            labels[i] = new JLabel(arr_categories.get(i).getCategory_name().toUpperCase());
            labels[i].setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
            labels[i].setForeground(new java.awt.Color(242, 242, 242));
            panels[i].add(labels[i]);
            sc_categories.add(panels[i]);

        }
    }

    public void displayCategorizedRestaurants(Category category) {
        ArrayList<Restaurant> cat_restaurants = Restaurant.getCategorizedRestaurants(category.getCategory_id());

        for (int i = 0; i < cat_restaurants.size(); i++) {
            random_color = rand.nextInt(50);
            restaurant_panels[i] = new javax.swing.JPanel(new GridBagLayout());
            restaurant_panels[i].setBackground(new java.awt.Color(195, random_color + 20, 52));
            restaurant_panels[i].setPreferredSize(new Dimension(220, 140));
            restaurant_labels[i] = new JLabel(cat_restaurants.get(i).getRestaurant_name().toUpperCase());
            restaurant_labels[i].setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
            restaurant_labels[i].setForeground(new java.awt.Color(242, 242, 242));
            restaurant_panels[i].add(restaurant_labels[i]);
            restaurant_panels[i].addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {

                    sc_meals.removeAll();
                    for (int i = 0; i < cat_restaurants.size(); i++) {
                        if (evt.getSource() == restaurant_panels[i]) {
                            restaurant_choice = i;
                        }
                    }
                    categoized_restaurants_f.setVisible(false);
                    home.setVisible(false);
                    categories.setVisible(false);
                    cart.setVisible(false);
                    restaurants.setVisible(false);
                    sc_meals.setVisible(true);
                    displayMealList(cat_restaurants.get(restaurant_choice));

                }
            });
            categoized_restaurants_f.add(restaurant_panels[i]);
        }
    }

    private void displayMealList(Restaurant restaurant) {
        ArrayList<Meal> meal_list = getMealList(restaurant);

        for (int i = 0; i < meal_list.size(); i++) {
                        random_color = rand.nextInt(80);
            meal_panels[i] = new javax.swing.JPanel(new GridBagLayout());
            meal_panels[i].setBackground(new java.awt.Color(224,random_color , 52));
            meal_panels[i].setPreferredSize(new Dimension(200, 150));
            meal_panels[i].addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {

                    for (int i = 0; i < meal_list.size(); i++) {
                        if (evt.getSource() == meal_panels[i]) {
                            meal_choice = i;
                        }
                    }
                    order.OrderMealFromRestaurant(restaurant, meal_choice);
                    order.setVisible(true);
                }

            });
            meal_labels[i] = new JLabel(meal_list.get(i).getMeal_name().toUpperCase());
            meal_labels[i].setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

            meal_labels[i].setForeground(new java.awt.Color(242, 242, 242));
            meal_panels[i].add(meal_labels[i]);
            sc_meals.add(meal_panels[i]);
        }

    }

    private void displayAllRestaurants() {

        ArrayList<Restaurant> all_restaurants = Restaurant.getRestaurantListAll();

        for (int i = 0; i < all_restaurants.size(); i++) {

            restaurant_panels[i] = new javax.swing.JPanel(new GridBagLayout());

            restaurant_panels[i].setBackground(new java.awt.Color(255, 102, 51));
            restaurant_panels[i].setPreferredSize(new Dimension(330, 220));
            restaurant_labels[i] = new JLabel(all_restaurants.get(i).getRestaurant_name().toUpperCase());
            restaurant_labels[i].setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
            restaurant_labels[i].setForeground(new java.awt.Color(0, 0, 0));
            restaurant_panels[i].add(restaurant_labels[i]);
            restaurant_panels[i].addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {

                    sc_meals.removeAll();
                    for (int i = 0; i < all_restaurants.size(); i++) {
                        if (evt.getSource() == restaurant_panels[i]) {
                            restaurant_choice = i;
                        }
                    }
                    categoized_restaurants_f.setVisible(false);
                    home.setVisible(false);
                    categories.setVisible(false);
                    cart.setVisible(false);
                    restaurants.setVisible(false);
                    sc_meals.setVisible(true);
                    displayMealList(all_restaurants.get(restaurant_choice));

                }
            });
            sc_restaurants.add(restaurant_panels[i]);
        }
    }


    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered

        // TODO add your handling code here:
        jLabel2.setForeground(new java.awt.Color(255, 89, 0));
        jPanel5.setBackground(new java.awt.Color(18, 18, 18));


    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel5.setBackground(new java.awt.Color(24, 24, 24));

    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        jLabel3.setForeground(new java.awt.Color(255, 89, 0));
        jPanel7.setBackground(new java.awt.Color(18, 18, 18));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jPanel7.setBackground(new java.awt.Color(24, 24, 24));


    }//GEN-LAST:event_jLabel3MouseExited

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mousepX, y - mousepY);

        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();

        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MousePressed

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
        jLabel4.setForeground(new java.awt.Color(255, 89, 0));
        jPanel8.setBackground(new java.awt.Color(18, 18, 18));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jPanel8.setBackground(new java.awt.Color(24, 24, 24));


    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
        jLabel5.setForeground(new java.awt.Color(255, 89, 0));
        jPanel9.setBackground(new java.awt.Color(18, 18, 18));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jPanel9.setBackground(new java.awt.Color(24, 24, 24));
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        home.setVisible(false);
        restaurants.setVisible(false);
        cart.setVisible(false);
        categories.setVisible(true);
        categoized_restaurants_f.setVisible(false);
        //  cleanMealList(Restaurant.getRestaurantListAll().get(restaurant_choice));
        //cleanMealList(Restaurant.getCategorizedRestaurants(cat_choice).get(restaurant_choice));

        categoized_restaurants_f.removeAll();
        jLabel3.setForeground(new java.awt.Color(255, 89, 0));
        jPanel7.setBackground(new java.awt.Color(18, 18, 18));


    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        home.setVisible(true);
        restaurants.setVisible(false);
        cart.setVisible(false);
        categories.setVisible(false);
        categoized_restaurants_f.setVisible(false);

        //cleanCategorized(Category.getCategoryList().get(userchoice));
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        home.setVisible(false);
        restaurants.setVisible(true);
        cart.setVisible(false);
        categoized_restaurants_f.setVisible(false);
        categoized_restaurants_f.removeAll();
        categories.setVisible(false);    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the CustomerForm */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cart;
    private javax.swing.JPanel categoized_restaurants_f;
    private javax.swing.JPanel categories;
    private javax.swing.JPanel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel restaurants;
    private javax.swing.JScrollPane sc;
    private javax.swing.JScrollPane sc1;
    private javax.swing.JPanel sc_categories;
    private javax.swing.JPanel sc_meals;
    private javax.swing.JPanel sc_restaurants;
    // End of variables declaration//GEN-END:variables
}