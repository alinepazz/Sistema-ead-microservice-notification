package com.ead.notification.repositories;

import com.ead.notification.enums.NotificationSatus;
import com.ead.notification.models.NotificationModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface NotificationRepository extends JpaRepository<NotificationModel, UUID> {
    Page<NotificationModel> findAllByUserIdAndNotificationSatus(UUID userId, NotificationSatus notificationSatus, Pageable pageable);


    Optional<NotificationModel> findByNotificationIdAndUserId(UUID notificationId, UUID userId);
}
